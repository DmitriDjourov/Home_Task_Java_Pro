package org.example;

import java.util.Date;

public class PriorityTask extends Task {
		/*	***Создайте класс PriorityTask, который наследуется от класса
				Task и добавляет следующую логику:
				Поле requiredPriority (требуемый приоритет для выполнения).
				Метод calculatePayment() переопределен так, чтобы стоимость выполнения
				задачи считалась только если приоритет задачи соответствует требуемому.	*/
		private int requiredPriority;//требуемый приоритет для выполнения

		public PriorityTask(String title, Date deadline, int priority, double reward, int requiredPriority) {
				super(title, deadline, priority, reward);
				this.requiredPriority = requiredPriority;
		}

		@Override
		public double calculatePayment() {
				if (getPriority() == requiredPriority) { // priority
						return super.calculatePayment();
				}
				return 0.0;
		}
}
