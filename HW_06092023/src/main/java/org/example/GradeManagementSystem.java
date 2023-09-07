package org.example;

import java.util.Random;

public class GradeManagementSystem {
  private Student[] students;
  private Teacher[] teachers;


  public GradeManagementSystem(Student[] students, Teacher[] teachers) {
    this.students = students;
    this.teachers = teachers;
  }

  public void processStudents() {
    System.out.println("Студенты : ");
    for (Student student : students) {
      System.out.println(student.getDescription());
    }
  }

  public void processTeachers() {
    System.out.println("Преподаватели :");
    for (Teacher teacher : teachers) {
      System.out.println(teacher.getDescription());
    }
  }

  public void gradeStudents() {
    System.out.println("Выставление оценок студентам : ");
    Random random = new Random();
    for (Student student : students) {
      // Случайный преподаватель
      Teacher teacher = teachers[random.nextInt(teachers.length)];
      //
      teacher.gradeStudent(student);
      System.out.println("Студент : " + student.getName() + " получил оценку : " + student.getGerade()
              + " . Преподаватель : " + teacher.getName());
    }
  }
}
