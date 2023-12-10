package org.example;

public class Student extends Person implements Geraded {
  private Grade grade;

  public Student(String name, int age, Grade grade) {
    super(name, age);
    this.grade = grade;
  }

  public Student(String name, int age) {
    super(name, age);
  }

  @Override
  public Grade getGerade() {
    return grade;
  }

  public void setGrade(Grade grade) {
    this.grade = grade;
  }

  @Override
  public String getDescription() {
    if (grade == null) {
      return "Студент: " + getName() + ", возраст: " + getAge() ;
    } else {
      return "Студент: " + getName() + ", возраст: " + getAge() + ", оценка: " + grade;
    }
  }
}
