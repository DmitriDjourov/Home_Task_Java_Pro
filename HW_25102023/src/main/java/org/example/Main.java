package org.example;

import com.github.javafaker.Faker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
		public static void main(String[] args) {
				List<Students> students = new ArrayList<>();

				students.add(new Students(new Faker().name().name(), 25, 100));
				students.add(new Students(new Faker().name().name(), 26, 50));
				students.add(new Students(new Faker().name().name(), 27, 80));

				System.out.println("Before serial: ");
				for (Students s : students) {
						System.out.println(s);
				}
//1.
				Main.saveStudentsToFile(students, "students.ser");
				Main.loadStudentsFromFile("students.ser");
//2.
				Main.filterAndSaveStudentsByGrade(students, 80, "filteredStudents.ser");
//3.
				double avgGrade = Main.calculateAverageGrade("students.ser");
				System.out.printf("Avg grade all students :  %.2f%n", avgGrade);
		}

		//*****Задание 1. Сериализация списка студентов
		//		Описание: Создайте класс Student с полями name
		//				                                   (имя студента), age (возраст) и grade (оценка).
		//		Реализуйте сериализацию и десериализацию списка студентов.
		//    Используйте потоки для обработки данных.
		//    Реализуйте метод saveStudentsToFile(List<Student> students, String filename), который будет сохранять список студентов в файл.
		//    Реализуйте метод List<Student> loadStudentsFromFile(String filename), который будет читать студентов из файла.
		public static void saveStudentsToFile(List<Students> students, String filename) {
				try {
						ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
						out.writeObject(students);
						out.close();
						System.out.println("Serialization students was done");

				} catch (IOException e) {
						throw new RuntimeException(e);
				}
		}

		public static List<Students> loadStudentsFromFile(String filename) {
				//Deserialization
				try {
						ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
						List<Students> students = (List<Students>) in.readObject();

						System.out.println("DE-Serialization was done");
						System.out.println("Before serial: ");
						for (Students s : students) {
								System.out.println(s);
						}
						return students;
				} catch (ClassNotFoundException | IOException e) {
						e.printStackTrace();
						return null;
				}
		}
		//*****Задание 2. Фильтрация студентов по оценке
//		Описание: Добавьте функционал, который позволит фильтровать студентов с оценкой выше определенного значения и сохранять их в отдельный файл.
//
//		Требования:
//		Реализуйте метод filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename), который будет сохранять студентов с оценкой выше gradeThreshold в файл.
		public static void filterAndSaveStudentsByGrade(List<Students> students, double gradeThreshold, String filename) {
				List<Students> filterStudents = new ArrayList<>();
				System.out.println("Filtered :");
				for (Students s : students) {
						if (s.getGrade() >= gradeThreshold) {
								filterStudents.add(s);
								System.out.println(s);
						}
				}
				try {
						ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
						out.writeObject(filterStudents);
						out.close();
						System.out.println("Serialization filteredStudents was done");
				} catch (IOException e) {
						throw new RuntimeException(e);
				}
		}

		//		*****Задание 3. Средний балл студентов
//		Описание: Напишите метод, который вычисляет средний балл всех студентов из файла.
//
//		Требования:
//		Реализуйте метод double calculateAverageGrade(String filename), который возвращает средний балл студентов.
		public static double calculateAverageGrade(String filename) {
				double studentsGrade = 0.0;
				List<Students> students = loadStudentsFromFile(filename);

				if (students == null || students.isEmpty()) {
						System.out.println("No students");
						return 0.0;
				}
				for (Students s : students) {
						studentsGrade = studentsGrade + s.getGrade();
				}
				return studentsGrade / students.size();
		}
}
