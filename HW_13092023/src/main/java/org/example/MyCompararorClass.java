package org.example;

import java.util.Comparator;

public class MyCompararorClass implements Comparator<MyClass> {
    @Override
    public int compare(MyClass person1, MyClass person2) {
        // сравниваем по возрасту
        int ageComparison = Integer.compare(person1.getAge(), person2.getAge());

        // если возраст одинаковый, сравниваем по фамилии
        if (ageComparison == 0) {
            int lastNameComparison = person1.getLast_name().compareTo(person2.getLast_name());
            // если фамилии одинаковые, сравниваем по имени
            if (lastNameComparison == 0) {
                return person1.getName().compareTo(person2.getName());
            }
            return lastNameComparison;
        }
        return ageComparison;
    }
}
