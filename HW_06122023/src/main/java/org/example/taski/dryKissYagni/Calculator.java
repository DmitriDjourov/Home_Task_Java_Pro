package org.example.taski.dryKissYagni;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}

class SimpleCalculator  {

    /**
     * Добавлено два integers.
     *
     * @param a Первая переменная.
     * @param b Вторая переменная.
     * @return  sum от a и b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает одно целое число из другого.
     *
     * @param a Уменьшаемое.
     * @param b Вычитаемое.
     * @return Результат вычитания b из a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     *Умножает два целых числа.
     *
     * @param a Первое целое число.
     * @param b Второе целое число.
     * @return Произведение a и b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Делит одно целое число на другое.
     *
     * @param a Дивиденд.
     * @param b Делитель (ненулевой).
     * @return Результат деления a на b.
     * @throws ArithmeticException Если b равно нулю.
     */
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}
