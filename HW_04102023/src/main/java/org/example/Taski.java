package org.example;
import java.util.*;
public class Taski {
		public static void main(String[] args) {
				List<Integer> list = Arrays.asList(32, 1, 6, 5, 4, 9, 9, 9, 9, 87);

				//Задание 1: Фильтрация списка целых чисел на нечетные числа
				System.out.println("==========================================================");
				System.out.println("Задание 1: Фильтрация списка целых чисел на нечетные числа");
				List<Integer> list6 = list.stream()
						                      .filter(el -> el % 2 == 1)
						                      .toList();
				System.out.println(list);
				System.out.println(list6);

				//Задание 2: Преобразование списка строк в список чисел
				System.out.println("======================================================");
				System.out.println("Задание 2: Преобразование списка строк в список чисел");
				List<String> stringList = Arrays.asList("32", "1", "6", "87");
				List<Integer> list7 = stringList.stream()
						                      .map(Integer::parseInt)
						                      .toList();
				System.out.println(stringList);
				System.out.println(list7);

				//Задание 3: Суммирование списка чисел
				System.out.println("=====================================");
				System.out.println("Задание 3: Суммирование списка чисел");
				List<Integer> list8 = Collections.singletonList(list.stream()
						                                                .mapToInt(Integer::intValue)
						                                                .sum());
				System.out.println(list);
				System.out.println(list8);

				//Задание 4: Определение максимального значения в списке
				System.out.println("======================================================");
				System.out.println("Задание 4: Определение максимального значения в списке");
				List<Integer> list9 = list.stream()
						                      .max(Integer::compareTo)
						                      .stream().toList();
				System.out.println(list);
				System.out.println(list9);

				//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование
				// их в верхний регистр
				System.out.println("====================================================================================");
				System.out.println("Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование\n" +
						                   " их в верхний регистр");
				List<String> arrList = Arrays.asList("anna", "alina", "tom", "alex");
				char startLetter = 'a';
				List<String> list10 = arrList.stream()
						                      .filter(el -> el.startsWith(String.valueOf(startLetter)))
						                      .map(String::toUpperCase)
						                      .toList();
				System.out.println(arrList);
				System.out.println(list10);

				//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
				System.out.println("=====================================================================================");
				System.out.println("Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов");
				List<String> strList = Arrays.asList("Шла Саша по шоссе и сосала сушку", "Ехал грека через реку",
						"Один за всех и все за одного", " Не было печали да Черти накачали");

				List<String> list11 = strList.stream()
						                      .flatMap(str -> Arrays.stream(str.split("\\s+")))//\\s+ - это регулярное выражение, которое представляет собой шаблон пробела.
						                      .filter(word -> word.length() > 4)
						                      .distinct()
						                      .toList();
				System.out.println(strList);
				System.out.println(list11);

				//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
				System.out.println("===================================================================================");
				System.out.println("Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту");
				List<Person> list12 = new ArrayList<>();
				list12.add(new Person("Петя", 25));
				list12.add(new Person("Вася", 20));
				list12.add(new Person("Коля", 5));
				list12.add(new Person("Хайм", 120));
				list12.add(new Person("Абрамчик", 120));

				System.out.println(list12);
				//Collections.sort(list12);
				list12.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
				System.out.println(list12);

				//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
				System.out.println("================================================================");
				System.out.println("Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел");
				int sum = list.stream()
						          .filter(s -> s % 3 == 0 || s % 5 == 0)
						          .mapToInt(Integer::intValue)
						          .sum();
				System.out.println(list);
				System.out.println(sum);
				//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
				System.out.println("=================================================================================");
				System.out.println("Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк");
				List<String> strList1 = Arrays.asList("Шла", "Саша", "Ехал", "Алла");
				List<String> list14 = strList1.stream()
						                      .filter(word -> word.chars().distinct().count() == word.length())
						                      .toList();
				System.out.println(strList1);
				System.out.println(list14);

				System.out.println("===================================================================================");
				System.out.println("===================================================================================");
		}
}
