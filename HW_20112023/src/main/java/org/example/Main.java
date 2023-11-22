package org.example;


public class Main {
		public static void main(String[] args) {
				OrderManagementSystem orderManagementSystem = new OrderManagementSystem();
				orderManagementSystem.start();

				// Let the system run for some time
				try {
						Thread.sleep(15000);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}

				// Stop the system
				orderManagementSystem.stop();

				// Create clients and track order status
				Client client1 = new Client();
				Client client2 = new Client();

				Order order1 = client1.createOrder("ProductA");
				Order order2 = client2.createOrder("ProductB");

				System.out.println("Client Orders:");
				client1.trackOrderStatus();
				client2.trackOrderStatus();
		}
}