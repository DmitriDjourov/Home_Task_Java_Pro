package org.example.taski;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
		private Calculator calculator = new Calculator();

		// 1. Простое сложение двух чисел
		@Test
		@DisplayName("1.Тест.Простое сложение двух чисел ")
		// 1. Простое сложение двух чисел
		//public int add(int a, int b) {
//				return a + b;
//		}
		void addTest() {
				int a = 10;
				int b = 10;
				int expected = 20;

				Assertions.assertEquals(expected, calculator.add(a, b));
		}

		// 2. Вычитание
		@Test
		@DisplayName("2.Тест.Вычитание ")
		//  public int subtract(int a, int b) {
		//        return a - b;
		//    }
		void subtractTest() {
				int a = 10;
				int b = 9;
				int expected = 1;

				Assertions.assertEquals(expected, calculator.subtract(a, b));
		}

		@Test
		@DisplayName("3.Тест.Умножение ")
				// 3. Умножение
//		public int multiply(int a, int b) {
//				return a * b;
//		}
		void multiplyTest() {
				int a = 10;
				int b = 2;
				int expected = 20;

				Assertions.assertEquals(expected, calculator.multiply(a, b));
		}

		// 4. Деление
//		public int divide(int a, int b) {
//				if(b == 0) {
//						throw new ArithmeticException("Division by zero");
//				}
//				return a / b;
//		}

		@Test
		@DisplayName("4.Тест.Деление ")
		void divideTest() {
				int a = 10;
				int b = 2;
				int expected = 5;

				Assertions.assertEquals(expected, calculator.divide(a, b));
		}

		@Test
		@DisplayName("4.Тест.Деление ExceptionByZero")
		void divideExceptionByZeroTest() {
				int a = 10;
				int b = 0;

				Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
		}

		// 5. Возведение в степень
//		public double power(double base, double exponent) {
//				return Math.pow(base, exponent);
//		}
		@Test
		@DisplayName("5.Тест.Возведение в степень")
		void powerTest() {
				double baseTest = 10.0;
				double exponentTest = 2;
				double expected = 100;

				Assertions.assertEquals(expected, calculator.power(baseTest, exponentTest));
		}

		// 6. Вычисление факториала 5!= 120
//		public long factorial(int n) {
//				long rez = 1;
//				if (n < 0) {
//						throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел")
//				}
//				for (int i = 1; i <= n; i++) {
//						rez = rez * i;
//				}
//				return rez;
//		}
		@Test
		@DisplayName("6.Тест.Вычисление факториала")
		void factorialTest() {
				int n = 5;
				int expected = 120;

				Assertions.assertEquals(expected, calculator.factorial(n));
		}

		// 7. Определение четности числа
//    public boolean isEven(int n) {
//        return n % 2 == 0;
//    }
		@Test
		@DisplayName("7.Тест.Определение четности числа")
		void isEvenTest() {
				int n = 10;
				boolean expected = true;

				Assertions.assertEquals(expected, calculator.isEven(n));
		}

		// 8. Поиск максимального числа в массиве
//		public int findMax(int[] array) {
//				int maxValue = array[0];
//				if (array.length == 0) {
//						throw new IllegalArgumentException("Массив не может быть пустым.");
//				}
//				for (int i = 1; i < array.length; i++) {
//						if (maxValue < array[i]) {
//								maxValue = array[i];
//						}
//				}
//				return maxValue;
//		}
		@Test
		@DisplayName("8.Тест.Поиск максимального числа в массиве")
		void findMaxTest() {
				int[] arr = {1, 2, 3, 4, 5};
				int maxNum = 5;

				Assertions.assertEquals(maxNum, calculator.findMax(arr));
		}

		@Test
		@DisplayName("8.Тест.Поиск максимального числа в массиве IllegalArgumentException")
		void findMaxArrayByZeroIllegalArgumentExceptionTest() {
				int[] arr = new int[0];
				Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.findMax(arr));
		}

		// 9. Определение простого числа
//		public boolean isPrime(int n) {
//				if (n <= 1) {
//						return false;
//				}
//				for (int i = 2; i <= Math.sqrt(n); i++) {
//						if (n % i == 0) {
//								return false;
//						}
//				}
//				return true;
//		}
		@Test
		@DisplayName("9.Тест.Определение простого числа")
		void isPrimeTest() {
				int primeNumber = 7;
				boolean expected = true;

				Assertions.assertEquals(expected, calculator.isPrime(primeNumber));
		}

		// 10. Перевод числа в строку с указанием системы счисления
//		public String toBaseString(int n, int base) {
//				if (base < 2 || base > 16) {
//						throw new IllegalArgumentException("Base should be between 2 and 16");
//				}
//				return Integer.toString(n, base);
//		}
		@Test
		@DisplayName("10.Тест.Перевод числа в строку с указанием системы счисления")
		void toBaseStringTest() {
				int n = 3;
				int base = 10;
				String expected = "3";

				Assertions.assertEquals(expected, calculator.toBaseString(n, base));
		}

		// 11. Вычисление корня числа
//		public double sqrt(double a) {
//				if (a < 0) {
//						throw new IllegalArgumentException("Negative numbers are not supported");
//				}
//				return Math.sqrt(a);
//		}
		@Test
		@DisplayName("11.Тест.Вычисление корня числа")
		void sqrtTest() {
				double a = 4;
				double expected = 2;

				Assertions.assertEquals(expected, calculator.sqrt(a));
		}

		@Test
		@DisplayName("11.Тест.Вычисление корня числа IllegalArgumentException")
		void sqrtIllegalArgumentExceptionTest() {
				double a = -1;
				Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(a));
		}

		// 12. Инвертирование строки
//		public static String reverseString(String input) {
//				if (input == null) {
//						throw new IllegalArgumentException("Строка не может быть пустой");
//				}
//				StringBuilder reversed = new StringBuilder(input);
//				reversed.reverse();
//				return reversed.toString();
//		}
		@Test
		@DisplayName("12.Тест.Инвертирование строки")
		void reverseStringTest() {
				String input = "ABC";
				String expected = "CBA";

				Assertions.assertEquals(expected, calculator.reverseString(input));
		}

		@Test
		@DisplayName("12.Тест.Инвертирование строки IllegalArgumentException")
		void reverseStringIllegalArgumentExceptionTest() {
				String input = null;
				Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.reverseString(input));
		}

		// 13. Проверка, является ли строка палиндромом
//		public boolean isPalindrome(String input) {
//				String reversed = reverseString(input);
//				return input.equals(reversed);
//		}
		@Test
		@DisplayName("13.Тест.Проверка, является ли строка палиндромом")
		void isPalindromeTest() {
				String input = "anna";
				boolean expected = true;

				Assertions.assertEquals(expected, calculator.isPalindrome(input));
		}

		// 14. Вычисление НОД  (Наибольший Общий Делитель) двух чисел
//		public int gcd(int a, int b) {
//				while (b != 0) {
//						int temp = b;
//						b = a % b;
//						a = temp;
//				}
//				return a;
//		}
		@Test
		@DisplayName("14.Тест.Вычисление НОД  (Наибольший Общий Делитель) двух чисел")
		void gcdTest() {
				int a = 2;
				int b = 8;
				int expected = 2;

				Assertions.assertEquals(expected, calculator.gcd(a, b));
		}

		// 15. Перемножение элементов массива
//		public static long productOfArray(int[] array) {
//				if(array == null || array.length ==0){
//						throw new IllegalArgumentException("Массив не может быть пустым");
//				}
//				long result = 1;
//				for (int i = 0; i < array.length; i++) {
//						result = result * array[i];
//				}
//				return result;
//		}
		@Test
		@DisplayName("15.Тест.Перемножение элементов массива")
		void productOfArrayTest() {
				int[] numbers = {2, 3, 4, 5};
				long expected = 120;

				Assertions.assertEquals(expected, calculator.productOfArray(numbers));
		}

		@Test
		@DisplayName("15.Тест.Перемножение элементов массива IllegalArgumentException")
		void productOfArrayIllegalArgumentExceptionTest() {
				int[] numbers = new int[0];

				Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.productOfArray(numbers));
		}

		// 16. Определение длины самого длинного слова в строке
//		public int lengthOfLongestWord(String sentence) {
//				String[] words = sentence.split("\\s+");
//				int maxLength = 0;
//				for (String word : words) {
//						if (word.length() > maxLength) {
//								maxLength = word.length();
//						}
//				}
//				return maxLength;
//		}
		@Test
		@DisplayName("16.Тест.Определение длины самого длинного слова в строке")
		void lengthOfLongestWordTest() {
				String sentence = "Шла Саша по шоссе";
				int expected = 5;

				Assertions.assertEquals(expected, calculator.lengthOfLongestWord(sentence));
		}

		// 17. Конвертация температуры из Цельсия в Фаренгейт
//		public static double celsiusToFahrenheit(double celsius) {
//				double fahrenheit;
//				fahrenheit = (celsius * 9 / 5) + 32;
//				return fahrenheit;
//		}
		@Test
		@DisplayName("17.Тест.Конвертация температуры из Цельсия в Фаренгейт")
		void celsiusToFahrenheitTest() {
				double celsius = 25.0;
				double fahrenheit = 77;

				Assertions.assertEquals(fahrenheit, calculator.celsiusToFahrenheit(celsius));
		}

		// 18. Проверка на вхождение подстроки в строку (без использования стандартных методов Java)
//		public static boolean containsSubstring(String main, String sub) {
//				if (main == null || sub == null) {
//						return false;
//				}
//
//				int mainLength = main.length();
//				int subLength = sub.length();
//
//				for (int i = 0; i <= mainLength - subLength; i++) {
//						int j;
//						for (j = 0; j < subLength; j++) {
//								if (main.charAt(i + j) != sub.charAt(j)) {
//										break;
//								}
//						}
//						if (j == subLength) {
//								return true; // Найдена подстрока
//						}
//				}
//
//				return false; // Подстрока не найдена
//		}
		@Test
		@DisplayName("18.Тест.Проверка на вхождение подстроки в строку")
		void containsSubstringTest() {
				String mainString = "Шла Саша по шоссе";
				String subString = "Саша";
				boolean expected = true;

				Assertions.assertEquals(expected, calculator.containsSubstring(mainString, subString));
		}

		// 19. Сумма цифр числа
		//256 --- 2 + 5 + 6
//		public static int sumOfDigits(int number) {
//				int sum = 0;
//				while (number > 0) {
//						int num = number % 10;
//						sum = sum + num;
//						number = number / 10;
//				}
//				return sum;
//		}
		@Test
		@DisplayName("19.Тест.Сумма цифр числа")
		void sumOfDigitsTest() {
				int num = 256;
				int expected = 13;

				Assertions.assertEquals(expected, calculator.sumOfDigits(num));
		}
		// 20. Проверка, является ли год високосным
//		public static boolean isLeapYear(int year) {
//				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//						return true; // Год високосный
//				} else {
//						return false; // Год не високосный
//				}

		@Test
		@DisplayName("20.Тест.Проверка, является ли год високосным")
		void isLeapYearTest() {
				int year = 2024;
				boolean expected = true;

				Assertions.assertEquals(expected, calculator.isLeapYear(year));
		}
}
