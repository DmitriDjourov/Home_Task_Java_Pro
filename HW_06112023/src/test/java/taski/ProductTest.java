package taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ProductTest {
		@Test
		void testCheckProductStock() {
				InventoryService inventoryService = new InventoryService();
				//productStockDatabase.put("ABC123", 100);
				Assertions.assertEquals(100, inventoryService.checkProductStock("ABC123"));
				Assertions.assertEquals(0, inventoryService.checkProductStock("NonSku"));
		}
		@Test
		void testUpdateStock() {
				InventoryService inventoryService = new InventoryService();
				Assertions.assertTrue(inventoryService.updateStock("ABC123", 50));
				Assertions.assertTrue(inventoryService.updateStock("XYZ987", -50));
				Assertions.assertFalse(inventoryService.updateStock("NonSku", 10));

				Assertions.assertEquals(150, inventoryService.checkProductStock("ABC123"));
				Assertions.assertEquals(150, inventoryService.checkProductStock("XYZ987"));
		}

		@Test
		void testFulfillOrder() {
				InventoryService inventoryService = Mockito.mock(InventoryService.class);
				OrderFulfillmentService orderService = new OrderFulfillmentService(inventoryService);
				Product product = new Product("ABC123", 100);
				Mockito.when(inventoryService.checkProductStock("ABC123")).thenReturn(100);

				Assertions.assertTrue(orderService.fulfillOrder(product, 50));
				Assertions.assertEquals(50, product.getStockQuantity());

				Mockito.when(inventoryService.checkProductStock("ABC123")).thenReturn(25);
				Assertions.assertFalse(orderService.fulfillOrder(product, 30));
				Assertions.assertEquals(25, product.getStockQuantity());
		}
		@Test
		void testReturnItemsToInventory() {
				InventoryService inventoryService = Mockito.mock(InventoryService.class);
				OrderFulfillmentService orderService = new OrderFulfillmentService(inventoryService);

				Product product = new Product("XYZ987", 200);
				Mockito.when(inventoryService.updateStock("XYZ987", 50)).thenReturn(true);

				Assertions.assertTrue(orderService.returnItemsToInventory(product, 50));
				Assertions.assertEquals(250, product.getStockQuantity());

				Mockito.when(inventoryService.updateStock("XYZ987", 250)).thenReturn(false);
				Assertions.assertFalse(orderService.returnItemsToInventory(product, 250));
				Assertions.assertEquals(250, product.getStockQuantity());
		}
}
