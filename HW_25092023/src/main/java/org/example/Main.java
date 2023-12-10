package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
		public static void main(String[] args) {
//				- Создать 10 объектов класса
				Student student1 = new Student("Vasya", 23, false, 'C');
				Student student2 = new Student("Anna", 43, false, 'D');
				Student student3 = new Student("Rita", 24, false, 'C');
				Student student4 = new Student("Kolya", 23, false, 'B');
				Student student5 = new Student("Inna", 19, true, 'A');
				Student student6 = new Student("Tom", 23, false, 'B');
				Student student7 = new Student("Alex", 20, false, 'D');
				Student student8 = new Student("Dmitr", 50, true, 'A');
				Student student9 = new Student("Misha", 40, true, 'A');
				Student student10 = new Student("Iosif", 73, true, 'A');


//				- Поместить все с Хэш СЕт и вывести на экран
				HashSet<Student> students = new HashSet<>();

				students.add(student1);
				students.add(student2);
				students.add(student3);
				students.add(student4);
				students.add(student5);
				students.add(student6);
				students.add(student7);
				students.add(student8);
				students.add(student9);
				students.add(student10);

				//System.out.println(students);

				for (Student s : students) {
						System.out.println(s.getName());
				}
//				- Создайте TreeSet и найдите наименьший и наибольший элементы (int) в нем, перебирая элементы внутри набора.
				TreeSet<Integer> treeSet = new TreeSet<>();

				treeSet.add(22);
				treeSet.add(11);
				treeSet.add(32);
				treeSet.add(45);
				treeSet.add(99);
				treeSet.add(76);
				treeSet.add(55);
				treeSet.add(43);
				treeSet.add(3);
				treeSet.add(1);

				System.out.println(treeSet);
				System.out.println(treeSet.first());
				System.out.println(treeSet.last());

/*				- Напишите метод, который принимает Set и находит все объекты, содержащие определенную подстроку(из поля стринг),
				перебирая элементы и используя метод contains.*/

				Set<String> wordSet = new HashSet<>();
				wordSet.add("Mama");
				wordSet.add("Ima");
				wordSet.add("Papa");
				wordSet.add("Aba");
				wordSet.add("Tata");
				wordSet.add("Mamo");

				String subString = "Ma";

				Set<String> myWords = GetSearchSubStr.getSearchSubStr(wordSet, subString);

				for (String s : myWords) {
						System.out.println(s);
				}
//				- Напишите метод, которая удаляет все четные инт из HashSet и выводит оставшиеся элементы. Используйте итератор

				HashSet<Integer> integers = new HashSet<>();
				integers.add(11);
				integers.add(2);
				integers.add(32);
				integers.add(33);
				integers.add(5);
				integers.add(52);

				System.out.println(integers);
				GetDelEvenNum.getDelEvenNum(integers);
				System.out.println(integers);

//				- Создайте метод, который принимает два HashSet<Наш Класс> и возвращает новый HashSet,
//		  		содержащий элементы, которые присутствуют в обоих множествах

				Student student11 = new Student("Moysha", 73, true, 'A');
				Student student12 = new Student("Abramchik", 73, true, 'A');

				HashSet<Student> students2 = new HashSet<>();

				students2.add(student11);
				students2.add(student12);
				students2.add(student10);
				students2.add(student9);
				students2.add(student8);

				HashSet<Student> interRezultat = GetIntersection.getIntersection(students, students2);
				for (Student s : interRezultat) {
						System.out.println(s.getName());
				}
		}

		public static class ClassWork {
				public static void main(String[] args) {
						/*
						 //     * List<Integer> numbers = Arrays.asList(1.txt, 2, 3, 4, 5, 6, 7, 8, 9, 10);
						 //     * -- Отфильтровать нв четные и не четные
						 //     * -- Просуммировать все числа
						 //     * -- Получить среднее значение
						 //     * -- Найти суммы чисел кратных 3 и 5
						 //     * <p>
						 //     * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
						 //     * -- Преобразовать список строк в список чисел
						 //     * <p>
						 //     * <p>
						 //     * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi")
						 //     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
						 //     * -- Получить список слов которые содержат только уникальные символы

		*/
						List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
						// Отфильтровать нв четные
						List<Integer> numEvens = numbers.stream()
								                         .filter(num -> num%2 == 0)
								                         .collect(Collectors.toList());
						System.out.println("Четные числа: " + numEvens);

						//  -- Отфильтровать не четные
						List<Integer> numOdd = numbers.stream()
								                       .filter(num -> num%2 != 0)
								                       .collect(Collectors.toList());
						System.out.println("Нечетные числа: " + numOdd);
						//Просуммировать все числа
						int numSum = numbers.stream()
								                        .mapToInt(num -> num.intValue())
								                        .sum();
						System.out.println("Сумма чисел: " + numSum);

						// Получение среднего значения
						double avg = numbers.stream()
								             .mapToInt(num -> num.intValue())
								             .average()
								             .orElse(0.0);
						System.out.println("Среднее значение: " + avg);

						// суммы чисел кратных 3 и 5
						int sumNum3and5 = numbers.stream()
								                  .filter(num -> num%3 == 0 || num%5 ==0)
								                  .mapToInt(num -> num.intValue())
								                  .sum();
						System.out.println("Суммы чисел кратных 3 и 5: " + sumNum3and5);
						System.out.println("================================================");


						List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
						//     * -- Преобразовать список строк в список чисел
						List<Integer> nums = strings.stream()
								                     .map(Integer::parseInt)
								                     .collect(Collectors.toList());
						System.out.println("Список: " + nums);

						System.out.println("==================================================");
						List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
						//     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
						List<String> listFiltrA = words.stream()
								                          .filter(word -> word.startsWith("a"))
								                          .map(String::toUpperCase)
								                          .collect(Collectors.toList());
						System.out.println("Слова, начинающиеся с 'a' в верхнем регистре: " + listFiltrA);

						//     * -- Получить список слов которые содержат только уникальные символы
						List<String> uniqueCharacterWords = words.stream()
								                                    .filter(word -> word.chars().distinct().count() == word.length())
								                                    .collect(Collectors.toList());
						System.out.println("Слова с уникальными символами: " + uniqueCharacterWords);
				}
		}
}

