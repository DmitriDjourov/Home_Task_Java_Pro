package org.example.taski.dryKissYagni;//package PROF.dryKissYagni;
//
//// Нарушение SOLID: Нарушение принципа единственной ответственности
//public class Order {
//    private List<Item> items;
//
//    public void addItem(Item item) {
//        // Добавление товара
//    }
//
//    public void calculateTotal() {
//        // Вычисление общей стоимости заказа
//    }
//
//    public void printInvoice() {
//        // Печать счета
//    }
//}
/**
 *  рефакторинг . делим на более мелкие классы, каждый из которых будет выполнять свою ответственность
 */
//public class Order {
//		private List<Item> items;
//
//		public void addItem(Item item) {
//				// Добавление товара
//		}
//
//		public double calculateTotal() {
//				double total = 0;
//				for (Item item : items) {
//						total += item.getPrice();
//				}
//				return total;
//		}
//}
//
//public class InvoicePrinter {
//		public void printInvoice(Order order) {
//				// Печать счета на основе данных из заказа
//		}
//}
