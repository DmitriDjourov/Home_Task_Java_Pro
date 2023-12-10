package org.example;
import java.util.*;
import java.util.stream.Stream;

public class Main {
		public static void main(String[] args) {
				//     * -- Отфильтровать нв четные и не четные
				List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

				//     * -- Отфильтровать на четные
				List<Integer> numsEven = numbers.stream()
						                         .filter(num -> num % 2 == 0)
						                         .toList();
				//     * -- Отфильтровать на не четные
				List<Integer> numsOdd = numbers.stream()
						                        .filter(num -> num % 2 != 0)
						                        .toList();

				System.out.println("Отфильтровать на четные :" + numsEven);
				System.out.println("Отфильтровать на не четные :" + numsOdd);

				//     * -- Просуммировать все числа
				int numSum = numbers.stream()
						             .mapToInt(Integer::intValue)
						             .sum();
				System.out.println("Просуммировать все числа :" + numSum);

				//     * -- Получить среднее значение
				double avgNum = numbers.stream()
						                .mapToInt(Integer::intValue)
						                .average()
						                .orElse(0.0);
				System.out.println("Получить среднее значение : " + avgNum);

				//     * -- Найти суммы чисел кратных 3 и 5
				int numSum3and5krat = numbers.stream()
						                      .filter(num -> num % 3 == 0 || num % 5 == 0)
						                      .mapToInt(Integer::intValue)
						                      .sum();
				System.out.println("суммы чисел кратных 3 и 5 :" + numSum3and5krat);

				//     * -- Преобразовать список строк в список чисел
				List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
				List<Integer> nums = strings.stream()
						                     .map(Integer::parseInt)
						                     .toList();
				System.out.println("Преобразовать список строк в список чисел : " + nums);

				//     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
				List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
				List<String> filteredWords = words.stream()
						                             .filter(w -> w.startsWith("a"))
						                             .map(String::toUpperCase)
						                             .toList();
				System.out.println("строки на те которые начинаются на 'a' и преобразовать из в верхний регистр :" + filteredWords);

				//     * -- Получить список слов которые содержат только уникальные символы
				List<String> uniqSimvolWords = words.stream()
						                               .filter(w -> w.chars()
								                                            .distinct()
								                                            .count() == words.size())
						                               .toList();
				System.out.println("Слова с уникальными символами: " + uniqSimvolWords);

				//Задание 1: Фильтрация списка целых чисел на нечетные числа
				List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				List<Integer> num = numbers1.stream()
						                    .filter(n -> n % 2 != 0)
						                    .toList();
				System.out.println("Задание 1 : Фильтрация списка целых чисел на нечетные числа :" + num);

				//Задание 2: Преобразование списка строк в список чисел
				List<String> strings1 = Arrays.asList("1", "2", "3", "4", "5");
				List<Integer> nums1 = strings1.stream()
						                      .map(Integer::parseInt)
						                      .toList();
				System.out.println("Задание 2 : Преобразование списка строк в список чисел " + nums1);

				//Задание 3: Суммирование списка чисел
				List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
				Optional<Integer> numSum1 = numbers.stream().reduce(Integer::sum);
				numSum1.ifPresent(value -> System.out.println("Задание 3 : Суммирование списка чисел : " + value));

				//Задание 4: Определение максимального значения в списке
				Optional<Integer> maxNum = numbers3.stream()
						                           .max(Integer::compareTo);
				maxNum.ifPresent(value -> System.out.println("Задание 4 : Определение максимального значения в списке : " + value));

				//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистре
				List<String> words5 = Arrays.asList("anna", "andrey", "dima", "misha", "rita");
				List<String> filteredUpperWords = words5.stream()
						                                  .filter(w -> w.startsWith("a"))
						                                  .map(String::toUpperCase)
						                                  .toList();
				System.out.println("Задание 5 : Фильтрация списка строк на те, которые начинаются с определенной буквы и " +
						                   "преобразование их в верхний регистре : " + filteredUpperWords);

				//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
				List<String> words6 = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
				List<String> uniqWords = words6.stream()
						                         .filter(w -> w.length() > 4)
						                         .distinct()
						                         .toList();
				System.out.println("Задание 6 : Получение списка уникальных слов из списка строк," +
						                   " длина которых больше 4 символов : " + uniqWords);

				//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
				class Person {
						private final String name;
						private final int age;

						public Person(String name, int age) {
								this.name = name;
								this.age = age;
						}

						public String getName() {
								return name;
						}

						public int getAge() {
								return age;
						}
				}
				List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
				List<String> names = people.stream()
						                     .sorted(Comparator.comparing(Person::getAge))
						                     .flatMap(person -> Stream.of(person.getName()))
						                     .toList();
				System.out.println("Задание 7 : Преобразование списка объектов класса в список их имен," +
						                   " отсортированных по возрасту : " + names);

				//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
				List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

				Optional<Integer> sumNum = numbers4.stream()
						                           .filter(n -> n % 3 == 0 || n % 5 == 0)
						                           .reduce(Integer::sum);
				sumNum.ifPresent(value -> System.out.println("Задание 8 : Нахождение суммы чисел, кратных 3 и 5," +
						                                             " из списка чисел : " + value));

				//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
				List<String> words1 = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
				List<String> wordsWithUniqChars = words1.stream()
						                                  .filter(w -> w.chars().distinct().count() == words.size())
						                                  .toList();
				System.out.println("Задание 9 : Получение списка слов, содержащих только уникальные " +
						                   "символы, из списка строк " + wordsWithUniqChars);
		}
}