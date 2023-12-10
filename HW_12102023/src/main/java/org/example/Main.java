package org.example;


import java.util.*;
import java.util.Date;
public class Main {
		public static void main(String[] args) {

				HashSet<Task> tasks = new HashSet<>();

				Task task3 = new Task(3, "Описание задачи 3", "1", 2, "выполнено");
				Task task4 = new Task(4, "Описание задачи 4", "3", 3, "выполнено");
				Task task5 = new Task(5, "Описание задачи 5", "2", 4, "в процессе");

				tasks.add(task3);
				tasks.add(task4);
				tasks.add(task5);
				System.out.println("Список задач :");
				for (Task s : tasks) {
						System.out.println(s);
				}
				System.out.println("========================");
				//public List<Task> listHighPriorityTasks(): Метод, который возвращает список задач с
				//высоким приоритетом.
				TaskManager.listHighPriorityTasks(tasks);
				System.out.println("или");
				LibraryManagerStream.listHighPriorityTasksStream(tasks);//strim

				System.out.println("========================");
				// public List<Task> listTasksByStatus(String status): Метод, который возвращает список
				//задач с указанным статусом.
				TaskManager.getTaskStatus(tasks,"выполнено");
				System.out.println("или");
				LibraryManagerStream.getTaskStatusStream(tasks,"выполнено");

				List<Task> List_tasks = new ArrayList<>();
				List_tasks.add(task3);
				List_tasks.add(task4);
				List_tasks.add(task5);
				System.out.println("========================");

				//public Map<String, Integer> countTasksByStatus(): Метод, который возвращает отображение
				//(Map) со статусами задач и количеством задач в каждом статусе.
				Map<String, Integer> statusCount = TaskManager.countTasksByStatus(List_tasks);
				System.out.println(statusCount);
				System.out.println("или");
				Map<String, Long> statusCountStream = LibraryManagerStream.countTasksByStatusStream(List_tasks);
				System.out.println(statusCountStream);
				System.out.println("========================");

				//public void createTask(Task task): Метод, который создает новую задачу и добавляет ее в
				//список задач.
				TaskManager.createTask(List_tasks);
				System.out.println("или");
				LibraryManagerStream.createTaskStream(List_tasks);
				System.out.println("========================");

				//public void assignTask(User user, Task task): Метод, который назначает задачу пользователю.
				List<Task> taskList = new ArrayList<>();
				Map<Date, List<Task>> userTaskList = new HashMap<>();
				User user1 = new User(1, "Dima", "dfasf@fdfh.com", taskList, userTaskList);
				TaskManager.assignTask(user1,task3);
				System.out.println("или");
				LibraryManagerStream.assignTaskStream(user1);
				System.out.println("========================");

				//public void updateTaskStatus(Task task, String newStatus): Метод, котоый обновляет статус задачи.
				String newStatus = "переделать";
				TaskManager.updateTaskStatus(task3,newStatus);
				System.out.println("или");
				LibraryManagerStream.updateTaskStatusStream(task3,newStatus);
				System.out.println("========================");
		}
}