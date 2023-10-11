package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
		//	1.  * Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
//
//		private static void m1() {
//				List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
//*************************************************************************************
		public static void m1() {
				List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
				long count = list.stream()
						             .filter(el -> el.contains("Java"))
						             .count();
				System.out.println(count);
		}

		//	2.
//		 * Дан список целых чисел. Необходимо найти максимальный
//		 * элемент списка, который делится на заданное число без остатка.
//		 */
//		private static void m2() {
//				List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
//*************************************************************************************
		public static void m2() {
				List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
				OptionalInt max = list.stream()
						                  .mapToInt(Integer::intValue)
						                  .filter(el -> el % 2 == 0)
						                  .max();
				System.out.println(max);
		}

		//		3.
//		 * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
//		 * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.
//
//		private static void m3() {
//				List<Person> people = Arrays.asList(
//						new Person("John", 20),
//						new Person("Jane", 25),
//						new Person("Jack", 30),
//						new Person("James", 35),
//						new Person("Jill", 40)
//				);
//*************************************************************************************
		public static void m3() {
				List<Person> people = Arrays.asList(
						new Person("John", 20),
						new Person("Jane", 25),
						new Person("Jack", 30),
						new Person("James", 35),
						new Person("Jill", 40),
						new Person("Vasya", 120)
				);

				double numJ = people.stream()
						              .filter(el -> el.getName().startsWith("J"))
						              .mapToInt(Person::getAge)
						              .average()
						              .orElse(0.0);
				System.out.println(numJ);

		}

		//		4.
//		 * Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
//		 * этой коллекции строк, и вернуть их в виде списка.
//		 */
//		private static void m4() {
//				List<String> lines = Arrays.asList(
//						"Java is a programming language.",
//						"Java is widely used in enterprise applications.",
//						"Python is gaining popularity as a data science tool.",
//						"Python is a versatile programming language."
//				);
//*************************************************************************************
		public static void m4() {
				List<String> lines = Arrays.asList(
						"Java is a programming language.",
						"Java is widely used in enterprise applications.",
						"Python is gaining popularity as a data science tool.",
						"Python is a versatile programming language."
				);
				List<String> list = lines.stream()
						                    .flatMap(el -> Arrays.stream(el.split(" ")))
						                    .distinct()
						                    .toList();
				System.out.println(list);
		}

		//    5.
// * Подсчитать буквы в нижнем и верхнем регистре
//
// *************************************************************************************
		public static void m5() {
				String ss = "KikJhYggfTgf";
				char[] chars = ss.toCharArray();
				List<Character> list = new ArrayList<>();
				for (Character ch : chars) {
						list.add(ch);
				}
				long countUpper = list.stream()
						                  .filter(Character::isUpperCase)
						                  .count();
				System.out.println("Подсчитать буквы верхнем регистре в стринге: " + countUpper);

				long countLower = list.stream()
						                  .filter(Character::isLowerCase)
						                  .count();
				System.out.println("Подсчитать буквы в нижнем регистре в стринге: " + countLower);
		}

		//    6.
// * Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional
// Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
// Optional<Map.Entry<Integer, List<String>>> max =
// *************************************************************************************
		public static void m6() {
				Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
				Optional<Map.Entry<Integer, List<String>>> max = stream
						                                                 .collect(Collectors.groupingBy(String::length, Collectors.toList()))
						                                                 .entrySet().stream().max(Map.Entry.comparingByKey());
				System.out.println(max);
		}

		//		7.
//		 * Дан список сотрудников, у каждого из которых есть поле "salary".
//		 * Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
//		 * в компаниях, которые находятся в городах, начинающихся на букву "M".
//		 */
//*************************************************************************************
		public static void m7() {
				Company company1 = new Company("AAA", "Milan");
				Company company2 = new Company("BBB", "Tel-Aviv");

				List<Employee> employeeList = Arrays.asList(
						new Employee("Anton", 20_000, "developer", company2),
						new Employee("Vasiya", 40_000, "developer", company1),
						new Employee("Vika", 20_000, "developer", company1),
						new Employee("Dima", 100_000, "manager", company2),
						new Employee("Misha", 200_000, "boss", company1),
						new Employee("Nikolay", 15_000, "security", company1)
				);
				double avgSal = employeeList.stream()
						                .filter(employee -> "developer".equals(employee.getJob()))
						                .filter(employee -> employee.getCompany().getCity().startsWith("M"))
						                .collect(Collectors.averagingDouble(Employee::getSalary));
				System.out.println("среднюю зарплату сотрудников, работающих на должности 'developer' " +
						                   "* в компаниях, которые находятся в городах, начинающихся на букву 'M'. : " + avgSal);
		}

		//    8.
//		/**
//		 * У нас есть список списков numbers,
//		 * и мы хотим получить все четные числа из этих списков.
//		 * Мы используем flatMap, чтобы преобразовать каждый внутренний
//		 * список в поток чисел, а затем фильтруем только четные числа.
//		 * Результат: Even numbers: [2, 4, 6].
//		 */
//		List<List<Integer>> numbers = Arrays.asList(
//				Arrays.asList(1, 2),
//				Arrays.asList(3, 4),
//				Arrays.asList(5, 6)
//		);
//*************************************************************************************
		public static void m8() {
				List<List<Integer>> myNumbers = Arrays.asList(
						Arrays.asList(1, 2),
						Arrays.asList(3, 4),
						Arrays.asList(5, 6)
				);

				List<Integer> evenNums = myNumbers.stream()
						                         .flatMap(Collection::stream)//.flatMap(myList -> myList.stream())
						                         .filter(nums -> nums % 2 == 0)
						                         .toList();
				System.out.println(evenNums);
		}
//		*************************************************************************************
//		9.
//		/**
//		 * Есть два списка list1 и list2, и мы
//		 * хотим получить все возможные комбинации сумм чисел из обоих списков.
//		 * Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
//		 * затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
//		 * и наконец, собираем все значения в combinedList.
//		 * Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].
//		 */
//		List<Integer> list1 = Arrays.asList(1, 2, 3);
//		List<Integer> list2 = Arrays.asList(4, 5, 6);

		public static void m9() {
				List<Integer> list1 = Arrays.asList(1, 2, 3);
				List<Integer> list2 = Arrays.asList(4, 5, 6);

				List<Integer> combinedList = list1.stream()
						                             .flatMap(i -> list2.stream().map(j -> i + j))
						                             .toList();
				System.out.println(combinedList);
		}
}

