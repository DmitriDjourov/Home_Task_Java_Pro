package org.example;

import java.util.*;

public class TaskiAdd {
		public static void main(String[] args) {
				// Задача 1: Фильтрация четных чисел и умножение на 2.
				List<Integer> list = Arrays.asList(32, 1, 6, 5, 4, 9, 9, 9, 9, 87);

				List<Integer> numsEvento2 = list.stream()
						                            .filter(n -> n % 2 == 0)
						                            .map(el -> el * 2)
						                            .toList();
				System.out.println("Задача 1 : Фильтрация четных чисел и умножение на 2. : " + numsEvento2);

				// Задача 2: Удаление дубликатов из списка строк.
				List<String> arrList = Arrays.asList("anna", "anna", "alina", "tom", "alex");
				List<String> dubleWordList = arrList.stream()
						                             .distinct()
						                             .toList();
				System.out.println("Задача 2 : Удаление дубликатов из списка строк. : " + dubleWordList);

				// Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
				List<Integer> limitList = list.stream()
						                          .sorted(Comparator.reverseOrder())
						                          .limit(3)
						                          .toList();
				System.out.println("Задача 3 : Сортировка списка чисел в порядке убывания и выбор первых трех элементов. : " + limitList);

				// Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
				List<String> words = Arrays.asList("Apple", "banana", "apricot", "cherry", "kiwi", "mango");
				List<String> filteredWords = words.stream()
						                             .filter(w -> w.startsWith("A"))
						                             .map(String::toUpperCase)
						                             .toList();
				System.out.println("Задача 4 : Фильтрация строк, начинающихся на 'A' и преобразование в верхний регистр. : " + filteredWords);

				// Задача 5: Пропуск первых двух элементов и вывод оставшихся.
				List<Integer> skipList = list.stream()
						                         .skip(2)
						                         .toList();
				System.out.println("Задача 5 : Пропуск первых двух элементов и вывод оставшихся : " + skipList);

				// Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
				List<Integer> filtrListUp50sqw2 = list.stream()
						                                  .filter(num -> num > 50)
						                                  .map(el -> el * el)
						                                  .toList();
				System.out.println("Задача 6 : Фильтрация чисел больше 50 и вывод их квадратов. : " + filtrListUp50sqw2);

				// Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
				List<String> filteredWordsWithO = words.stream()
						                                  .filter(w -> w.contains("o"))
						                                  .sorted(Comparator.reverseOrder())
						                                  .toList();
				System.out.println("Задача 7 : Оставить только слова, содержащие букву 'o' и вывести их в обратном порядке. : " + filteredWordsWithO);

				// Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
				List<Integer> oddListOrder = list.stream()
						                             .filter(num -> num % 2 == 1)
						                             .sorted()
						                             .toList();
				System.out.println("Задача 8 : Фильтрация чисел, оставить только нечетные и вывести их в " +
						                   "порядке возрастания. : " + oddListOrder);

				// Задача 9: Получить среднее значение чисел в списке.
				OptionalDouble avgNum = list.stream()
						                        .mapToInt(Integer::intValue)
						                        .average();
				System.out.println("Задача 9 : Получить среднее значение чисел в списке. : " + avgNum);

				// Задача 10: Получить строку, объединяющую элементы списка через запятую.
				List<String> str = Collections.singletonList(String.join(",", words));
				System.out.println("Задача 10 : Получить строку, объединяющую элементы списка через запятую. : " + str);

				// Задача 11: Получить список квадратов чисел из другого списка.
				List<Integer> sqNumFromList = list.stream()
						                              .map(n -> n * n)
						                              .toList();
				System.out.println("Задача 11 : Получить список квадратов чисел из другого списка : " + sqNumFromList);

				// Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
				List<Character> listAZ = words.stream()
						                      .flatMap(w-> w.chars().mapToObj(ch -> (char) ch))
						                      .distinct()
						                      .sorted()
						                      .toList();
				System.out.println("Задача 12 : Получить список букв из списка слов и вывести их в алфавитном порядке. : " + listAZ);

				// Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
				List<String> listThreeWordsReverse = words.stream()
						                                     .limit(3)
						                                     .sorted(Comparator.reverseOrder())
						                                     .toList();
				System.out.println("Задача 13 : Получить первые 3 строки из списка и вывести их в обратном" +
						                   " порядке. : " + listThreeWordsReverse);

				// Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
				List<String> words1 = Arrays.asList("Apple", "banana", "apricot", "cherry", "kiwi", "mango","mango");
				List<String> listWordsMinus2OnlyUniq = words1.stream()
						                                       .skip(2)
						                                       .distinct()
						                                       .toList();
				System.out.println("Задача 14 : Пропустить первые 2 элемента и оставить только уникальные. : " + listWordsMinus2OnlyUniq);

				// Задача 15: Фильтрация и сортировка пользователей по возрасту.
				List<Person> list12 = new ArrayList<>();
				list12.add(new Person("Петя", 25));
				list12.add(new Person("Вася", 20));
				list12.add(new Person("Коля", 5));
				list12.add(new Person("Хайм", 110));
				list12.add(new Person("Абрамчик", 120));

				List<Person> filteredAndSortedUsers = list12.stream()
						                                    .filter(user -> user.getAge() > 25)
						                                    .sorted((user1, user2) -> Integer.compare(user1.getAge(), user2.getAge()))
						                                    .toList();
				System.out.println("Задача 15 : Фильтрация и сортировка пользователей по возрасту. : " + filteredAndSortedUsers);
		}
}
