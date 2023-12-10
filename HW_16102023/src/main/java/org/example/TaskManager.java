package org.example;

import java.util.List;

/****Создайте класс TaskManager, который будет управлять задачами и оптимизировать
 код для управления ими.

 Параметризируйте класс таким образом, чтобы он мог работать
 с разными типами задач. Класс TaskManager должен содержать следующие методы:

 Метод addTask(task: Task), который добавляет задачу в систему.
 Метод calculateTotalPayment(), который суммирует стоимость в
 ыполнения всех задач в системе.*/
public class TaskManager<T extends Task> {
		private List<T> tasks;

		public TaskManager(List<T> tasks) {
				this.tasks = tasks;
		}

		public void addTask(T task) {
				tasks.add(task);
		}

		public double calculateTotalPayment() {
				double totalPayment = 0.0;
				for (T task : tasks) {
						totalPayment = totalPayment + task.calculatePayment();
				}
				return totalPayment;
		}
}
