package org.example.taski.dryKissYagni;

public class CircleQ {
    private double radius;
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class Circle {
    private double radius;
    public Circle (double radius) {
        this.radius = radius;
    }
    public double getRadius() { // Геттер для получения значения радиуса
        return radius;
    }
    public void setRadius(double radius) {// Сеттер для установки значения радиуса
        this.radius = radius;
    }

    // Метод для вычисления площади круга
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления длины окружности
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}