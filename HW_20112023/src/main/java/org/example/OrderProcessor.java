package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class OrderProcessor {
		private Queue<Order> orderQueue = new LinkedList<>();

		//добавление заказа в очередь (синхронизированный),
		public synchronized void addOrder(Order order) {
				orderQueue.add(order);
				notify(); // занято
		}

		//извлечение заказа из очереди (синхронизированный)
		public synchronized Order processNextOrder() throws InterruptedException {
				while (orderQueue.isEmpty()) {
						wait();// если пустото жду
				}
				Order order = orderQueue.poll();//достаем заказ из очереди
				order.processOrder();//Обработка заказа меняем статус
				return order;
		}

		public synchronized int size() {
				return orderQueue.size();
		}


}
