package org.example;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class User {
		private int userId;
		private String userName;
		private String userEmail;
		private List<Task> userTasks;
		private Map<Date, List<Task>> userTaskList;

		// Конструктор класса User
		public User(int userId, String userName, String userEmail, List<Task> userTasks, Map<Date, List<Task>> userTaskList) {
				this.userId = userId;
				this.userName = userName;
				this.userEmail = userEmail;
				this.userTasks = userTasks;
				this.userTaskList = userTaskList;
		}

		// Геттеры и сеттеры для каждого поля

		public int getUserId() {
				return userId;
		}

		public void setUserId(int userId) {
				this.userId = userId;
		}

		public String getUserName() {
				return userName;
		}

		public void setUserName(String userName) {
				this.userName = userName;
		}

		public String getUserEmail() {
				return userEmail;
		}

		public void setUserEmail(String userEmail) {
				this.userEmail = userEmail;
		}

		public List<Task> getUserTasks() {
				return userTasks;
		}

		public void setUserTasks(List<Task> userTasks) {
				this.userTasks = userTasks;
		}

		public Map<Date, List<Task>> getUserTaskList() {
				return userTaskList;
		}

		public void setUserTaskList(Map<Date, List<Task>> userTaskList) {
				this.userTaskList = userTaskList;
		}

		@Override
		public String toString() {
				return "User{" +
						       "userId=" + userId +
						       ", userName='" + userName + '\'' +
						       ", userEmail='" + userEmail + '\'' +
						       ", userTasks=" + userTasks +
						       ", userTaskList=" + userTaskList +
						       '}';
		}
}