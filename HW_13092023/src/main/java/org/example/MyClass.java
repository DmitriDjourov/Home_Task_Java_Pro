package org.example;

import java.util.Objects;

// 5.6 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
public class MyClass implements Comparable<MyClass> {
    private String name;
    private String last_name;
    private int age;

    public MyClass(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ' ' + last_name + ' ' + age;
    }

    @Override
    public int compareTo(MyClass o) {
        return Integer.compare(o.age, this.age);
    }

    // Переопределяем методы equals() и hashCode() для сравнения объектов по полям name, last_name и age

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyClass other = (MyClass) obj;
        return age == other.age && name.equals(other.name) && last_name.equals(other.last_name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + last_name.hashCode();
        result = 31 * result + age;
        return result;
    }

}
