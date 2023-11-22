package org.example;

import lombok.Getter;

class Order {
		private static int nextOrderId = 1;
		private int orderId;
		@Getter
		private String status;
		private String products;

		public Order(String products) {
				this.orderId = nextOrderId++;
				this.products = products;
				this.status = "Created";
		}

		public int getOrderID() {
				return orderId;
		}

		public void processOrder() {
				// изменение статуса
				status = "Processed";
		}

		@Override
		public String toString() {
				return "Order{id=" + orderId + ", status='" + status + "', products='" + products + "'}";
		}
}