package org.example.taski.dryKissYagni;

public class SU {
		public static String formatName(String firstName, String lastName) {
				return firstName + " " + lastName;
		}

		public static String formatAddress(String street, String city, String zipCode) {
				return street + ", " + city + ", " + zipCode;
		}

		// Дублирование кода форматирования строки
		public static String formatString(String... parts) {
				StringBuilder builder = new StringBuilder();
				for (String part : parts) {
						builder.append(part).append(", ");
				}
				return builder.toString().trim();
		}
}

/**
 * Рефакторинг.
 * String.join для объединения строк с разделителем
 */
class NewSU {

		public static String formatName(String firstName, String lastName) {
				return firstName + " " + lastName;
		}

		public static String formatAddress(String street, String city, String zipCode) {
				return street + ", " + city + ", " + zipCode;
		}

		public static String formatString(String... parts) {
				return String.join(", ", parts);
		}
}
