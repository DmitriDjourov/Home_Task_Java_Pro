package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*Создайте примеры использования классов и их оптимизацию через параметризацию,
		а также примеры вычисления общей стоимости выполнения задач.*/
public class Main {
		public static void main(String[] args) {
				List<Task> tasks = new ArrayList<>();
				TaskManager<Task> taskManager = new TaskManager<>(tasks);

				UrgentTask urgentTask = new UrgentTask("Срочная задача", 100.0);
				taskManager.addTask(urgentTask);

				PriorityTask priorityTask1 = new PriorityTask("Важная задача 1", new Date(), 2, 150.0, 2);
				PriorityTask priorityTask2 = new PriorityTask("Важная задача 2", new Date(), 3, 200.0, 2);
				taskManager.addTask(priorityTask1);
				taskManager.addTask(priorityTask2);

				for (Task task : tasks) {
						System.out.println("Задача: " + task.getTitle());
						System.out.println("Срок выполнения: " + task.getDeadline());
						System.out.println("Приоритет: " + task.getPriority());
						System.out.println("Стоимость выполнения: " + task.calculatePayment());
						System.out.println();
				}

				double totalPayment = taskManager.calculateTotalPayment();
				System.out.println("Общая стоимость выполнения задач: " + totalPayment);
		}
}