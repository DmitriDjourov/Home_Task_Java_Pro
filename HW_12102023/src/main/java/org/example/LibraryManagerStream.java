package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryManagerStream {
		private Task TaskList;

		public LibraryManagerStream(Task taskList, User userList) {
				TaskList = taskList;
				this.userList = userList;
		}

		private User userList;

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
				return "LibraryManagerStream{" +
						       "TaskList=" + TaskList +
						       ", userList=" + userList +
						       '}';
		}

		//public List<Task> listHighPriorityTasks(): Метод, который возвращает список задач с
		//высоким приоритетом.
		public static void listHighPriorityTasksStream(HashSet<Task> setString) {
				int highPriority = setString.stream()
						                   .mapToInt(Task::getTaskPriority)
						                   .max()
						                   .orElse(0);

				// Выводим список задач с высоким приоритетом
				System.out.println("Список задач с высоким приоритетом (stream):");
				setString.stream()
						.filter(task -> task.getTaskPriority() == highPriority)
						.forEach(System.out::println);


		}

		// public List<Task> listTasksByStatus(String status): Метод, который возвращает список
		//задач с указанным статусом.
		public static void getTaskStatusStream(HashSet<Task> setTasks, String status) {
				System.out.println("Список задач с указанным статусом (stream) : " + status);

				setTasks.stream()
						.filter(task -> task.getTaskStatus().equals(status))
						.forEach(System.out::println);
		}


		//public Map<String, Integer> countTasksByStatus(): Метод, который возвращает отображение
		//(Map) со статусами задач и количеством задач в каждом статусе.
		public static Map<String, Long> countTasksByStatusStream(List<Task> tasks) {
				System.out.println("Метод, который возвращает отображение(Map) со статусами задач и количеством задач в каждом статусе");
				Map<String, Long> taskCountStatus = tasks.stream()
						 .collect(Collectors.groupingBy(Task::getTaskStatus, Collectors.counting()));
				return taskCountStatus;
		}
		//public void createTask(Task task): Метод, который создает новую задачу и добавляет ее в
		//список задач.
public static void createTaskStream(List<Task> tasks) {
		System.out.println("Метод, который создает новую задачу и добавляет ее в список задач.");
		Task task6 = new Task(6, "Описание задачи 6", "2", 4, "в процессе");
		tasks.add(task6);
		System.out.println("Список задач после добавления новой задачи:");
		tasks.forEach(System.out::println);

}
		//public void assignTask(User user, Task task): Метод, который назначает задачу пользователю.
		public static void assignTaskStream(User user) {
				List<Task> userTasks = user.getUserTasks();
				Map<Date, List<Task>> userTaskList = user.getUserTaskList();
				System.out.println("Метод, который назначает задачу пользователю. ");
				user.getUserTasks().forEach(System.out::println);
				System.out.println("User Task List:");
				user.getUserTaskList().forEach((date, tasks) -> {
						System.out.println(date);
						tasks.forEach(System.out::println);
				});

		}
		//public void updateTaskStatus(Task task, String newStatus): Метод, котоый обновляет статус задачи.
	//использование Stream в данном случае не имеет смысла, так как мы не работаем с коллекцией объектов. Поэтому, мы можем оставить метод без изменений.
	public static void updateTaskStatusStream(Task task, String newStatus) {
			System.out.println("Метод, котоый обновляет статус задачи: с " + task.getTaskStatus() + " на " + newStatus);
			System.out.println(task);
			task.setTaskStatus(newStatus);
			System.out.println(task);
	}

}