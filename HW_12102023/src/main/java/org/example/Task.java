package org.example;

import java.util.Date;
import java.util.Calendar;

public class Task {
		private int id;
		private String taskTitle;
		private String taskDescription;
		private int taskPriority;
		private String taskStatus;
		private Date taskDueDate ;


		public Task(int id, String taskTitle, String taskDescription, int taskPriority, String taskStatus, Date taskDueDate) {
				this.id = id;
				this.taskTitle = taskTitle;
				this.taskDescription = taskDescription;
				this.taskPriority = taskPriority;
				this.taskStatus = taskStatus;
				this.taskDueDate = taskDueDate;

		}

		// Конструктор с параметрами и значением по умолчанию для taskDueDate
		public Task(int id, String taskTitle, String taskDescription, int taskPriority, String taskStatus) {
				this(id,
						taskTitle,
						taskDescription,
						taskPriority,
						taskStatus,
						Calendar.getInstance().getTime()); // Использую дату как значение по умолчанию
		}



		public int getId() {
				return id;
		}

		public void setId(int id) {
				this.id = id;
		}

		public String getTaskTitle() {
				return taskTitle;
		}

		public void setTaskTitle(String taskTitle) {
				this.taskTitle = taskTitle;
		}

		public String getTaskDescription() {
				return taskDescription;
		}

		public void setTaskDescription(String taskDescription) {
				this.taskDescription = taskDescription;
		}

		public int getTaskPriority() {
				return taskPriority;
		}

		public void setTaskPriority(int taskPriority) {
				this.taskPriority = taskPriority;
		}

		public String getTaskStatus() {
				return taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
				this.taskStatus = taskStatus;
		}

		public Date getTaskDueDate() {
				return taskDueDate;
		}

		public void setTaskDueDate(Date taskDueDate) {
				this.taskDueDate = taskDueDate;
		}

		@Override
		public String toString() {
				return "\nTask{" +
						       "id=" + id +
						       ", taskTitle='" + taskTitle + '\'' +
						       ", taskDescription='" + taskDescription + '\'' +
						       ", taskPriority=" + taskPriority +
						       ", taskStatus='" + taskStatus + '\'' +
						       ", taskDueDate='" + taskDueDate + '\'' +
						       '}';
		}
}
