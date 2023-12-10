package org.example;
import java.util.Random;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class CardNumberGenerator {

		public static void main(String[] args) {
				String cardNumber = generateCardNumber();
				String expiryDate = generateExpiryDate();
				String cvv = generateCVV();

				System.out.println("Card Number: " + cardNumber);
				System.out.println("Expiry Date: " + expiryDate);
				System.out.println("CVV: " + cvv);
		}

		// Генерация случайного числа в заданном диапазоне
		private static int getRandomNumber(int min, int max) {
				Random random = new Random();
				return random.nextInt(max - min + 1) + min;
		}

		// Генерация номера карты с использованием алгоритма Луна
		private static String generateCardNumber() {
				long prefix = 4_000_000_000_000_000L; // Префикс для Visa карт
				String cardNumber = String.valueOf(prefix + getRandomNumber(0, 999999999));

				// Добавляем проверную цифру по алгоритму Луна
				int checkDigit = generateLuhnCheckDigit(cardNumber);
				cardNumber += checkDigit;

				return cardNumber;
		}

		// Генерация проверной цифры алгоритмом Луна
		private static int generateLuhnCheckDigit(String cardNumber) {
				int sum = 0;
				boolean doubleDigit = false;
				for (int i = cardNumber.length() - 1; i >= 0; i--) {
						int digit = Character.getNumericValue(cardNumber.charAt(i));
						if (doubleDigit) {
								digit *= 2;
								if (digit > 9) {
										digit -= 9;
								}
						}
						sum += digit;
						doubleDigit = !doubleDigit;
				}
				int checkDigit = (sum * 9) % 10;
				return checkDigit;
		}

		// Генерация срока окончания действия карты (месяц и год)
		private static String generateExpiryDate() {
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.YEAR, getRandomNumber(1, 2)); // Срок от 1 до 2 лет
				calendar.set(Calendar.MONTH, getRandomNumber(0, 11)); // Месяц от 0 (январь) до 11 (декабрь)

				SimpleDateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
				return dateFormat.format(calendar.getTime());
		}

		// Генерация CVV (Security Code)
		private static String generateCVV() {
				DecimalFormat df = new DecimalFormat("000"); // Форматирование в 3-значное число
				return df.format(getRandomNumber(0, 999));
		}
}
