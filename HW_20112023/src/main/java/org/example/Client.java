package org.example;

import java.util.ArrayList;
import java.util.List;

public class Client {
		private static int nextClientId = 1;
		private int clientId;
		private List<Order> orders;

		public Client() {
				this.clientId = nextClientId++;
				this.orders = new ArrayList<>();
		}

		public Order createOrder(String products) {
				Order order = new Order(products);
				orders.add(order);
				return order;
		}

		public void trackOrderStatus() {
				for (Order order : orders) {
						System.out.println("Client " + clientId + " - Order " + order.getOrderID() +
								                   ": Status - " + order.getStatus());
				}
		}
}
