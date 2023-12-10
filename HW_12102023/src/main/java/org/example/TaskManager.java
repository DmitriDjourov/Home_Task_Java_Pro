package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.*;

@Data
@Builder

public class TaskManager {
		private Task TaskList;
		private User userList;

		public TaskManager(Task taskList, User userList) {
				TaskList = taskList;
				this.userList = userList;
		}

		public Task getTaskList() {
				return TaskList;
		}

		public void setTaskList(Task taskList) {
				TaskList = taskList;
		}

		public User getUserList() {
				return userList;
		}

		public void setUserList(User userList) {
				this.userList = userList;
		}

		@Override
		public String toString() {
				return "TaskManager{" +
						       "TaskList=" + TaskList +
						       ", userList=" + userList +
						       '}';
		}


		//public List<Task> listHighPriorityTasks(): Метод, который возвращает список задач с
		//высоким приоритетом.
		public static void listHighPriorityTasks(HashSet<Task> setString) {

				// Выводим список задач с высоким приоритетом
				System.out.println("Список задач с высоким приоритетом:");
				int taskPrioritytemp = 0;
				for (Task task : setString) {
						if (task.getTaskPriority() > taskPrioritytemp) {
								taskPrioritytemp = task.getTaskPriority();
						}
				}
				for (Task task : setString) {
						if (task.getTaskPriority() == taskPrioritytemp) {
								System.out.println(task);
						}
				}
		}

		// public List<Task> listTasksByStatus(String status): Метод, который возвращает список
		//задач с указанным статусом.
		public static void getTaskStatus(HashSet<Task> setString, String status) {
				String strStatus = null;
				System.out.println("Cписок задач с указанным статусом:" + status);
				for (Task task : setString) {
						if (task.getTaskStatus().equals(status)) {
								strStatus = task.getTaskStatus();
						}
				}
				for (Task task : setString) {
						if (task.getTaskStatus().equals(strStatus)) {
								System.out.println(task);
						}
				}

		}

		//public Map<String, Integer> countTasksByStatus(): Метод, который возвращает отображение
		//(Map) со статусами задач и количеством задач в каждом статусе.
		public static Map<String, Integer> countTasksByStatus(List<Task> tasks) {
				Map<String, Integer> map = new HashMap<>();
				System.out.println("Метод, который возвращает отображение(Map) со статусами задач и количеством задач в каждом статусе");
				for (Task task : tasks) {
						String taskStatus = task.getTaskStatus();
						map.put(taskStatus, map.getOrDefault(taskStatus, 0) + 1);
				}
				return map;
		}

		//public void createTask(Task task): Метод, который создает новую задачу и добавляет ее в
		//список задач.
		public static void createTask(List<Task> tasks) {
				HashSet<Task> task = new HashSet<>();
				System.out.println("Метод, который создает новую задачу и добавляет ее список задач.");
				System.out.println(tasks);
				Task task6 = new Task(6, "Описание задачи 6", "2", 4, "в процессе");
				tasks.add(task6);
				System.out.println(tasks);
		}


		//public void assignTask(User user, Task task): Метод, который назначает задачу пользователю.
		public static void assignTask(User user, Task task) {
				List<Task> userTasks = user.getUserTasks();
				Map<Date, List<Task>> userTaskList = user.getUserTaskList();
				System.out.println("Метод, который назначает задачу пользователю. ");
				System.out.println(user);
				userTasks.add(task);
				// Группируем задачи по дате и обновляем userTaskList
				groupByDueDate(userTasks, userTaskList);
				user.setUserTasks(userTasks);
				user.setUserTaskList(userTaskList);
				System.out.println(user);
		}
//		assignTaskStream

		// Метод для группировки задач по дате
		private static void groupByDueDate(List<Task> tasks, Map<Date, List<Task>> taskList) {
				taskList.clear(); // Очищаем текущий список задач

				for (Task task : tasks) {
						Date dueDate = task.getTaskDueDate();

						// Получаем список задач для данной даты или создаем новый список, если его нет
						List<Task> tasksForDate = taskList.getOrDefault(dueDate, new ArrayList<>());

						// Добавляем задачу к списку задач для данной даты
						tasksForDate.add(task);

						// Обновляем список задач для данной даты
						taskList.put(dueDate, tasksForDate);
				}
		}

		//public void updateTaskStatus(Task task, String newStatus): Метод, котоый обновляет статус задачи.
		public static void updateTaskStatus(Task task, String newStatus) {
				System.out.println("Метод, котоый обновляет статус задачи: с " + task.getTaskStatus() + " на " + newStatus);
				System.out.println(task);
				task.setTaskStatus(newStatus);
				System.out.println(task);
		}
}


