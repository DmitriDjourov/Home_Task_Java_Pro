package org.example;

import java.util.Date;

/****Создайте класс UrgentTask, который наследуется
 от класса Task и добавляет следующую логику:

 У задачи срочного выполнения приоритет всегда равен 1.
 Дедлайн для задач срочного выполнения всегда равен сегодняшней дате.
 Метод calculatePayment() переопределен так, чтобы стоимость выполнения
 задачи срочного выполнения была вдвое выше.*/
public class UrgentTask extends Task {
		public UrgentTask(String title, double reward) {
				super(title, new Date(), 1, reward);
		}

		@Override
		public double calculatePayment() {
				return super.calculatePayment() * 2;
		}
}
