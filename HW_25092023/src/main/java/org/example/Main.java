package org.example;

import java.util.*;

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
}

