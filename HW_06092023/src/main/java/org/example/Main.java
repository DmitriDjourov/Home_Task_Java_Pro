package org.example;


import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    // Создаем студентов
    Student[] students = {
 /*         Student student1 = new Person("Nik", 25,  Grade.A);
            Student student2 = new Person("Bob", 21,  Grade.B);
 */
            new Student("Анна", 20),
            new Student("Боря", 19),
            new Student("Мария", 21)
    };
    // Создаем преподавателей
    Teacher[] teachers = {
            new Teacher("Миша", 30, Grade.B),
            new Teacher("Дима", 50, Grade.A),
            new Teacher("Кирилл", 40, Grade.C)
    };
    // Создаем систему выставления оценок
    GradeManagementSystem gradeSystem = new GradeManagementSystem(students, teachers);
    // Вывод информации о студентах
    gradeSystem.processStudents();
    // Вывод информации о преподавателях
    gradeSystem.processTeachers();
    // Выставление оценок
    gradeSystem.gradeStudents();



/*    teacher.gradeStudent(student1);// случайное присвоение оценки по умолчанию у Анны оценка С
    System.out.println(student1.getDescription()); // Вывод информации о студенте, включая присвоенную оценку
    teacher.gradeStudent(student2);// случайное присвоение оценки по умолчанию у Анны оценка С
    System.out.println(student2.getDescription()); // Вывод информации о студенте, включая присвоенную оценку
    System.out.println(teacher.getDescription());*/
  }
}