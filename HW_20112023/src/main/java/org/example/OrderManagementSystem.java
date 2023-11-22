package org.example;

class OrderManagementSystem {
		private OrderProcessor orderProcessor = new OrderProcessor();
		private volatile boolean isRunning = true;

		public void start() {
				Thread generatorThread = new Thread(new OrderGeneratorThread());
				Thread processorThread = new Thread(new OrderProcessingThread());
				Thread logisticsThread = new Thread(new LogisticsThread());
				Thread monitoringThread = new Thread(new MonitoringThread());

				generatorThread.start();
				processorThread.start();
				logisticsThread.start();
				monitoringThread.start();
		}

		public void stop() {
				isRunning = false;
		}

		private class OrderGeneratorThread implements Runnable {
				private int orderId = 1;

				@Override
				public void run() {
						while (isRunning) {
								String products = "Product" + orderId;
								Order order = new Order(products);
								orderProcessor.addOrder(order);
								try {
										Thread.sleep(1000); // Simulate order generation time
								} catch (InterruptedException e) {
										e.printStackTrace();
								}
						}
				}
		}
		private class LogisticThread implements Runnable {
				@Override
				public void run() {


				}
		}
		private class OrderProcessingThread implements Runnable {
				@Override
				public void run() {
						while (isRunning) {
								try {
										Order order = orderProcessor.processNextOrder();
										System.out.println("Order processed: " + order);
										Thread.sleep(2000); // Время обработки заказа
								} catch (InterruptedException e) {
										e.printStackTrace();
								}
						}
				}
		}

		private class LogisticsThread implements Runnable {
				@Override
				public void run() {
						while (isRunning) {
								// логистическая обработка
								try {
										Thread.sleep(3000);
								} catch (InterruptedException e) {
										e.printStackTrace();
								}
						}
				}
		}

		private class MonitoringThread implements Runnable {
				@Override
				public void run() {
						while (isRunning) {
								// Мониторинг состояния системы
								System.out.println("System is running. Orders in queue: " + orderProcessor.size());
								try {
										Thread.sleep(5000);
								} catch (InterruptedException e) {
										e.printStackTrace();
								}
						}
				}
		}
}



