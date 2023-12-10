package org.example;

import java.util.Random;

public class Teacher extends Person{

  private Grade teacherGrade;

  public Teacher(String name, int age, Grade teacherGrade) {
    super(name, age);
    this.teacherGrade = teacherGrade;
  }

  public Teacher(String name, int age) {
    super(name, age);
  }

  public void gradeStudent(Student student) {
    // Произвольное присвоение оценки студенту из перечисления Grade
    Random random = new Random();
    int randomGradeIndex = random.nextInt(Grade.values().length); // Случайный индекс оценки
    Grade randomGrade = Grade.values()[randomGradeIndex];
    student.setGrade(randomGrade);
  }
  @Override
  public String getDescription() {
    if (teacherGrade == null) {
      return "Преподаватель: " + getName() + ", возраст: " + getAge();
    } else {
      return "Преподаватель: " + getName() + ", возраст: " + getAge() + ", оценка, которую выставляет студентам: " + teacherGrade;
    }
  }
}
