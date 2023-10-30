package org.example;

public class Main {
		public static void main(String[] args) {

				boolean a = isPrime(0);
				System.out.println(a);

				String b = toBaseString(3, 8);
				System.out.println(b);

				String c = reverseString("ABC");
				System.out.println(c);

				int[] numbers = {2, 3, 4, 5};
				long product = productOfArray(numbers);
				System.out.println(product);

				double celsius = 25.0;
				double fahrenheit = celsiusToFahrenheit(celsius);
				System.out.println(fahrenheit);

				String mainString = "Шла Саша по шоссе";
				String subString = "Саша";
				boolean result = containsSubstring(mainString, subString);
				System.out.println(result);

				int v = sumOfDigits(256);
				System.out.println(v);

				int year = 2024;
				boolean is2902 = isLeapYear(year);
				if (is2902) {
						System.out.println(year + " - високосный год.");
				} else {
						System.out.println(year + " - не високосный год.");
				}

		}

		// 9. Определение простого числа
		public static boolean isPrime(int n) {
				if (n <= 1) {
						return false;
				}
				for (int i = 2; i <= Math.sqrt(n); i++) {
						if (n % i == 0) {
								return false;
						}
				}
				return true;
		}

		// 10. Перевод числа в строку с указанием системы счисления
		public static String toBaseString(int n, int base) {
				if (base < 2 || base > 16) {
						throw new IllegalArgumentException("Base should be between 2 and 16");
				}
				return Integer.toString(n, base);
		}

		// 12. Инвертирование строки
		public static String reverseString(String input) {
				if (input == null) {
						throw new IllegalArgumentException("Строка не может быть пустой");
				}
				StringBuilder reversed = new StringBuilder(input);
				reversed.reverse();
				return reversed.toString();
		}

		// 15. Перемножение элементов массива
		public static long productOfArray(int[] array) {
				if (array == null || array.length == 0) {
						throw new IllegalArgumentException("Массив не может быть пустым");
				}
				long result = 1;
				for (int i = 0; i < array.length; i++) {
						result = result * array[i];
				}
				return result;
		}

		// 17. Конвертация температуры из Цельсия в Фаренгейт
		public static double celsiusToFahrenheit(double celsius) {
				double fahrenheit;
				fahrenheit = (celsius * 9 / 5) + 32;
				return fahrenheit;
		}

		// 18. Проверка на вхождение подстроки в строку (без использования стандартных методов Java)
		public static boolean containsSubstring(String main, String sub) {
				if (main == null || sub == null) {
						return false;
				}

				int mainLength = main.length();
				int subLength = sub.length();

				for (int i = 0; i <= mainLength - subLength; i++) {
						int j;
						for (j = 0; j < subLength; j++) {
								if (main.charAt(i + j) != sub.charAt(j)) {
										break;
								}
						}
						if (j == subLength) {
								return true; // Найдена подстрока
						}
				}

				return false; // Подстрока не найдена
		}

		// 19. Сумма цифр числа
		//256 --- 2 + 5 + 6
		public static int sumOfDigits(int number) {
				int sum = 0;
				while (number > 0) {
						int num = number % 10;
						sum = sum + num;
						number = number / 10;
				}
				return sum;
		}
		// 20. Проверка, является ли год високосным
		public static boolean isLeapYear(int year) {
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
						return true; // Год високосный
				} else {
						return false; // Год не високосный
				}
		}
}