package taski;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;

class UserTest {
		EmailService emailService = mock(EmailService.class);
		NotificationService notificationService = new NotificationService(emailService);

		@BeforeEach
		void setUp() {
				emailService = mock(EmailService.class);
				notificationService = new NotificationService(emailService);
		}

		@Test
		void testNotifyUserSuccess() {

				User user = new User("1", "fsdfdsf@fsdfds.com");
				Mockito.when(emailService.sendEmail(eq(user.getEmail()), anyString(), anyString())).thenReturn(true);
				boolean result = notificationService.notifyUser(user, "subject", "message");

				Assertions.assertTrue(result);
				Mockito.verify(emailService).sendEmail(eq(user.getEmail()), anyString(), anyString());
		}

		@Test
		void testNotifyUserFailure() {
				User user = new User("1", "fsdfdsf@fsdfds.com");
				Mockito.when(emailService.sendEmail(eq(user.getEmail()), anyString(), anyString())).thenReturn(false);

				boolean result = notificationService.notifyUser(user, "Test Subject", "Test Message");

				Assertions.assertFalse(result);
				Mockito.verify(emailService).sendEmail(eq(user.getEmail()), anyString(), anyString());
		}
}