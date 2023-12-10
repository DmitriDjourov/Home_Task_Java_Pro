package taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
		@Test
		void testGettersAndSetters() {
				Product product = new Product("ABC123", 100);
				Assertions.assertEquals("ABC123", product.getSku());
				Assertions.assertEquals(100, product.getStockQuantity());

				product.setSku("XYZ987");
				product.setStockQuantity(200);

				Assertions.assertEquals("XYZ987", product.getSku());
				Assertions.assertEquals(200, product.getStockQuantity());
		}

		@Test
		void testProcessPayment() {
// моким интерфейс
				ExternalPaymentApi paymentApi = Mockito.mock((ExternalPaymentApi.class));
// обернули пайментапи в паймент сервис
				PaymentService paymentService = new PaymentService(paymentApi);
// создаем сущность
				Order order = new Order("1", 100.0, false);
// Stub  заглушки
				Mockito.when(paymentApi.requestPayment(order)).thenReturn(true);
				Mockito.when(paymentApi.verifyPayment("1")).thenReturn(true);
// утверждаю что метод вернет тру
				Assertions.assertTrue(paymentService.processPayment(order));
// проверка обращений к методам
				Mockito.verify(paymentApi).requestPayment(order);
				Mockito.verify(paymentApi).verifyPayment("1");

		}

		@Test
		void PlaceOrderTest() {
				PaymentService paymentService = Mockito.mock(PaymentService.class);
				OrderService orderService = new OrderService(paymentService);
				Order order = new Order("1", 100.0, false);

				Mockito.when(paymentService.processPayment(order)).thenReturn(true);

				Assertions.assertTrue(orderService.placeOrder(order));
				Assertions.assertTrue(order.isPaid());

				Mockito.verify(paymentService).processPayment(order);
		}
}