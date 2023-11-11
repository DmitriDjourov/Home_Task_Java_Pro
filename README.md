# Home_Task_Java_Pro

## **[Helper](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/Helper/src/main/java/org/example)**

# **Описание задания.**

## **[HW_28082023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_28082023)**
## * 1 уровень сложности: 
> ##  1. [Найти среднее арифметическое положительных элементов массива.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumPositivArrayElement.java)
> ##  2. [Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumOfAllElemDiv3notSimDiv5.java)
> ##  3. [Найти в массиве наибольшую сумму подряд идущих элементов.n](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumOfConsElem.java)

## **[HW_30082023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_30082023)**
## * 1 уровень сложности: 
**Цель: Создать программу для управления списком товаров в интернет-магазине**

>1. Enums:
>> ## 1.1. [ProductCategory - Перечисление для представления категорий товаров в магазине:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/ProductCategory.java)
>> ## 1.2. [Size - Перечисление для представления размеров одежды:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Size.java)
>> ## [1.3. Currency - Перечисление для представления валют для цен товаров:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Currency.java)

>2. Классы:
>> ## [2.1. Product - Класс для представления товара:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Currency.java)
**Поля:**
* id (уникальный идентификатор товара)
* name (имя товара)
* category (категория товара из ProductCategory)
* price (цена товара)
* currency (валюта цены из Currency)
* Конструктор для   полей.

>> ## [2.2. Clothing - Подкласс класса Product для представления одежды:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Clothing.java)
* Дополнительное поле size (размер одежды из Size).
* Конструктор для инициализации полей.

>> ## [2.3. ShopManager - Класс для управления списком товаров:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/ShopManager.java)

* Поле products (массив товаров).
* Метод addProduct(Product product) для добавления товара в список.
* Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории.
* Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
* заданном диапазоне цен и в указанной валюте.

## **[HW_06092003](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_06092023)**

# **Задача:**
> ## Разработать систему для управления оценками студентов и преподавателями в университете, используя язык программирования Java. Система должна включать в себя классы и интерфейсы для представления студентов, преподавателей и оценок, а также методы для работы с ними.

Функциональные требования:
===========================================
>> ## [Класс Person (Абстрактный класс):](HW_06092023/src/main/java/org/example/Person.java)
Создать абстрактный класс Person, который будет служить базовым классом для студентов и преподавателей.
Класс должен содержать следующие поля:
name (строка) - имя персоны.
age (целое число) - возраст персоны.
Класс Person должен иметь абстрактный метод getDescription(), который будет переопределен в подклассах.

====================================================

>> ## [Перечисление Grade (Enum):](HW_06092023/src/main/java/org/example/Grade.java)
Создать перечисление Grade для представления возможных оценок: A, B, C, D, F.
Интерфейс Graded:

===================================================
>> ## [Создать интерфейс Graded, который будет реализован классами, которые могут быть оценены. Интерфейс Graded должен содержать метод getGrade(), который будет возвращать оценку для объекта.](HW_06092023/src/main/java/org/example/Geraded.java)
====================================================
>> ## [Класс Student (наследник класса Person):](HW_06092023/src/main/java/org/example/Student.java)

Создать класс Student, который будет представлять студента.
Класс должен реализовать интерфейс Graded.
Класс Student должен содержать следующее поле:
grade (Grade) - оценка студента.
Класс Student должен переопределить метод getDescription(), чтобы возвращать информацию о студенте.

=====================================================
>> ## [Класс Teacher (наследник класса Person):](HW_06092023/src/main/java/org/example/Teacher.java)

Создать класс Teacher, который будет представлять преподавателя.
Класс Teacher не реализует интерфейс Graded.
Класс Teacher должен содержать следующее поле:
teacherGrade (Grade) - оценка, которую выставляет преподаватель студентам.
Класс Teacher должен иметь метод gradeStudent(), который будет выставлять оценку студенту. В данном ТЗ можно использовать случайное присвоение оценки студенту.
Класс Teacher должен переопределить метод getDescription() для вывода информации о преподавателе.

=========================================================================
>> ## [Класс GradeComparator (реализующий интерфейс Comparator):](HW_06092023/src/main/java/org/example/GradeComparator.java)

Создать класс GradeComparator, который будет реализовывать интерфейс Comparator<Student> для сравнения студентов по их
оценкам.
Класс должен содержать метод compare(), который сравнивает оценки двух студентов и возвращает результат сравнения.

=========================================================================
>> ## [Класс GradeManagementSystem:](HW_06092023/src/main/java/org/example/GradeManagementSystem.java)

Создать класс GradeManagementSystem, который будет управлять системой оценок в университете.
Класс GradeManagementSystem должен содержать следующие поля:
Массив объектов students (Student[]) - массив студентов.
Массив объектов teachers (Teacher[]) - массив преподавателей.
Класс GradeManagementSystem должен иметь методы:
processStudents() - метод для вывода информации о студентах (перебор массива студентов).
processTeachers() - метод для вывода информации о преподавателях (перебор массива преподавателей).
gradeStudents() - метод для автоматической выставления оценок студентам преподавателями
(используя метод gradeStudent() из класса Teacher).

## **Требования к реализации:**


Создать программу, которая демонстрирует работу системы управления оценками студентов и преподавателей.
Продемонстрировать использование интерфейсов, абстрактных классов, перечислений, массивов, циклов, сортировки с помощью интерфейсов Comparable и Comparator.
Программа должна быть читаемой и хорошо структурированной, с комментариями к ключевым частям кода.
Дополнительные задания (необязательные):

Реализовать более сложную логику для выставления оценок студентам в методе gradeStudent() класса Teacher.
Добавить возможность пользовательского ввода данных о студентах и преподавателях, а также вывод информации о студентах и преподавателях через консольный интерфейс.

## **[HW_13092003](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_13092023)**

## Уровень сложности 5 из 10

 5.1 [Найти сумму всех элементов ArrayList<Integer>.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L8)
        hw.getSum();

 5.2 [Найти среднее значение элементов LinkedList<Integer>.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L22)
        hw.getAvg();

 5.3 [Перебрать ArrayList<String> и вывести все элементы на экран.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L38)
        hw.ArrayList();

 5.4 [Перебрать LinkedList<String> и найти самую длинную строку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L51)
        hw.getLongestStreng();

 5.5 [Создать ArrayList с объектами вашего собственного класса и вывести их на экран.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L69)
        hw.doMyClassList();

## Уровень сложности 6 из 10:

 6.1 [Перебрать ArrayList<Integer> и найти наименьший элемент.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L88)
        hw.getMinElem();

 6.2 [Перебрать LinkedList<Integer> и найти наибольший элемент.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L105)
        hw.getMaxElem();

 6.3 [Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L122)
        hw.doArrayListStringStartC();

 6.4 [Перебрать LinkedList<String> и найти первое вхождение определенной строки.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L141)
        hw.doAnotherFirstLine();

 6.5 [Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
     удовлетворяющие определенному условию.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L165)
        hw.doMyClassListDelElem();

## Уровень сложности 7 из 10:

7.1 [Перебрать ArrayList<Integer> и удалить все четные числа.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L197)
        hw.doDelEvenElem();

7.2 [Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L223)
        hw.doReplaceElemMultiples3_zero();

7.3 [Перебрать ArrayList<String> и объединить все элементы в одну строку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L248)
        hw.DoAllElemOneString();

7.4 [Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L267)
        hw.getDelElemSpecificString();

7.5 [Создать ArrayList с объектами вашего собственного класса и вывести только те,
    которые удовлетворяют определенному условию.(все кто старше 20 лет)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L298)
        hw.doMyClassListSpecificPrint();

## Уровень сложности 8 из 10:

8.1 [Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L328)
        hw.doSumSumSquaresAllNumbers();

8.2 [Перебрать LinkedList<Integer> и вычислить произведение всех элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L345)
        hw.doProductAllNumbers();

8.3 [Перебрать ArrayList<String> и найти самую короткую строку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L362)
        hw.getShortestString();

8.4 [Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L380)
        hw.getReplacingVowelsWithStars();

8.5 [Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L403)
        hw.getSortDescendingOrder();

## Уровень сложности 9 из 10

9.1 [Перебрать ArrayList<Integer> и найти второй по величине элемент.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L428)
        hw.FindSecondLargestElement();

9.2 [Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L447)
        hw.ElemReverseOrder();

9.3 [Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L469)
        hw.getOnlyStringsWithLetters();

9.4 [Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L491)
        hw.getlongestStringWithoutSpaces();

9.5 [Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L510)
        hw.getOnlyUnicElem();

## Уровень сложности 10 из 10:

10.1 [Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L540)
        hw.getFindLargestIncreasingSequenceElem();

10.2 [Перебрать LinkedList<Integer> и удалить все дубликаты элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L578)
        hw.getDelAllDuplicateElem();

10.3 [Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L602)
        hw.getOnlUniqueStrings();

10.4 [Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L621)
        hw.getAllDelimitedString();

10.5 [Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L649)
        hw.getMyListMitFullySorted();
        
## **[HW_18092003](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_18092023)**

 1. [Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L9)
 2. [Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L22)
 3. [Переберите только значения в HashMap и TreeMap и найдите их среднее значение.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L41)
 4. [Переберите HashMap и найдите ключ с максимальным значением.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L63)
 5. [Переберите TreeMap и найдите ключ с минимальным значением.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L78)
 6. [Переберите HashMap и удалите все элементы с четными значениями.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L93)
 7. [Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L115)
 8. [Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L135)
 9. [Переберите HashMap и найдите ключ с максимальной суммой значений в его вложенных HashMap: HashMap<String, HashMap<String, Integer>> 
    nestedHashMap = new HashMap<>();](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L151)

##  [HW_25092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_25092023)   

- [Класс состоящий мз 4 полей разного типа](HW_25092023/src/main/java/org/example/Student.java)
- [Создать 10 объектов класса](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/a08f151b33f25ba8001ffb7572b51f5ee6240fc5/HW_25092023/src/main/java/org/example/Main.java#L8)
- [Поместить все с Хэш СЕт и вывести на экран](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/a08f151b33f25ba8001ffb7572b51f5ee6240fc5/HW_25092023/src/main/java/org/example/Main.java#L20)
- [Создайте TreeSet и найдите наименьший и наибольший элементы (int) в нем, перебирая элементы внутри набора.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/a08f151b33f25ba8001ffb7572b51f5ee6240fc5/HW_25092023/src/main/java/org/example/Main.java#L54)
- [Напишите метод, который принимает Set и находит все объекты, содержащие определенную подстроку(из поля стринг), перебирая элементы и используя 
  метод contains.](HW_25092023/src/main/java/org/example/GetSearchSubStr.java)
-[Напишите метод, которая удаляет все четные инт из HashSet и выводит оставшиеся элементы. Используйте итератор.](HW_25092023/src/main/java/org/example/GetDelEvenNum.java)
- [Создайте метод, который принимает два HashSet<Наш Класс> и возвращает новый HashSet, содержащий элементы, которые присутствуют в обоих множествах](HW_25092023/src/main/java/org/example/GetIntersection.java)

## **[HW_27092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example)**

## Техническое задание (ТЗ) №4: Управление задачами
## 1. Описание проекта
Цель проекта состоит в создании программы для управления задачами и
задачным списком. Проект будет включать минимум 3 класса с шестью полями
в каждом, а также класс для обработки задач с шестью методами, использующими циклы.

## 2. Классы
## 2.1. [Класс "Task"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/Task.java)
Поля:
- taskId (int): Уникальный идентификатор задачи.
- taskTitle (String): Название задачи.
- taskDescription (String): Описание задачи.
- taskPriority (int): Приоритет задачи (1 - низкий, 2 - средний, 3 - высокий).
- taskStatus (String): Статус задачи (открыта, в работе, завершена).
- taskDueDate (Date): Дата выполнения задачи.

## 2.2. [Класс "User"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/User.java)
Поля:
- userId (int): Уникальный идентификатор пользователя.
- userName (String): Имя пользователя.
- userEmail (String): Электронная почта пользователя.
- userTasks (List<Task>): Список задач, назначенных пользователю.
- userTaskList (Map<Date, List<Task>>): Список задач, сгруппированных по дате.

## 2.3. [Класс "TaskManager"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java)
Поля:
- taskList (List<Task>): Список всех задач.
- userList (List<User>): Список всех зарегистрированных пользователей.

## Методы:
1. [public List<Task> listHighPriorityTasks(): Метод, который возвращает список задач с
высоким приоритетом.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L46)
2. [public List<Task> listTasksByStatus(String status): Метод, который возвращает список
задач с указанным статусом.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L65)
3. [public Map<String, Integer> countTasksByStatus(): Метод, который возвращает отображение
(Map) со статусами задач и количеством задач в каждом статусе.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L83)
4. [public void createTask(Task task): Метод, который создает новую задачу и добавляет ее в
список задач.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L95)
5. [public void assignTask(User user, Task task): Метод, который назначает задачу пользователю.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L106)
6. [public void updateTaskStatus(Task task, String newStatus): Метод, котоый обновляет статус задачи.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L138)

## 3. Обработка данных
Задачи будут создаваться, назначаться, обновляться и фильтроваться с использованием
методов класса "TaskManager". Данные
о задачах и пользователях будут храниться в соответствующих объектах классов "Task" и "User".

## **[HW_28092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_28092023/src/main/java/org/example)**

# **Описание задания.**

## Уровень сложности 1: Написать игру казино.
1. - В игре должна быть реализована возможность играть в рулетку и в автоматы типа 777. Можно делать ставки,
2. - менять ставки, смотреть сколько денег осталось итд…..все что захотите.
## Реализация версия 0.1
1. - [модуль Main.java основной модуль встречаем-выпроваживаем](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/Main.java)  
2. - [модуль Clip.java чисто для создания атмосферы](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/Clip.java)
3. - [модуль AlcoholDrink.java чисто для поддержания атмосферы](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/AlcoholDrink.java)
4. - [модуль PlayRullette.java решение для игры рулетка](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/PlayRullette.java)
5. - [модуль Play777.java решение для игры 777](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/Play777.java)

## **[HW_04102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_04102023/src/main/java/org/example)**

## **[Past 1](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_04102023/src/main/java/org/example/Taski.java)**
1. - [Фильтрация списка целых чисел на нечетные числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L7)
2. - [Преобразование списка строк в список чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L16)
3. - [Суммирование списка чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L26)
4. - [Определение максимального значения в списке](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L35)
5. - [Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L44)
6. - [Получение списка уникальных слов из списка строк, длина которых больше 4 символов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L58)
7. - [Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L72)
8. - [Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L87)
9. - [Получение списка слов, содержащих только уникальные символы, из списка строк](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L96)
     
## **[Past 2](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_04102023/src/main/java/org/example/TaskiAdd.java)**
1. - [Фильтрация четных чисел и умножение на 2.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L7)
2. - [Удаление дубликатов из списка строк.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L16)
3. - [Сортировка списка чисел в порядке убывания и выбор первых трех элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L23)
4. - [Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L30)
5. - [Пропуск первых двух элементов и вывод оставшихся.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L38)
6. - [Фильтрация чисел больше 50 и вывод их квадратов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L44C8-L44C8)
7. - [Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L51C16-L51C16)
8. - [Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L58)
9. - [Получить среднее значение чисел в списке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L66)
10. - [Получить строку, объединяющую элементы списка через запятую.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L72)
11. - [Получить список квадратов чисел из другого списка.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L76)
12. - [Получить список букв из списка слов и вывести их в алфавитном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L82)
13. - [Получить первые 3 строки из списка и вывести их в обратном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L90)
14. - [Пропустить первые 2 элемента и оставить только уникальные.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L98)
15. - [Фильтрация и сортировка пользователей по возрасту.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L106)
 
 class User {
     private String name;
     private int age;
 
     public User(String name, int age) {
         this.name = name;
         this.age = age;
    }
     public String getName() {
        return name;
    }
     public int getAge() {
         return age;
    }
 }
 
## **[HW_09102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_09102023/src/main/java/org/example/Main.java)**

>>    * List<Integer> numbers = Arrays.asList(1.txt, 2, 3, 4, 5, 6, 7, 8, 9, 10);
>>    * -- [Отфильтровать нв четные и не четные](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L7)
>>    * -- [Просуммировать все числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L22)
>>    * -- [Получить среднее значение](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L28)
>>    * -- [Найти суммы чисел кратных 3 и 5](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L35)

>>    * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
>>    * -- [Преобразовать список строк в список чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L42)

>>    * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi")
>>    * -- [Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L49)
>>    * -- [Получить список слов которые содержат только уникальные символы](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L57)

## Задание 1: [Фильтрация списка целых чисел на нечетные числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L65)
>> List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
## Задание 2: [Преобразование списка строк в список чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L72)
>> List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
## Задание 3: [Суммирование списка чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L79)
>> List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
## Задание 4: [Определение максимального значения в списке](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L84)
## Задание 5: [Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистре](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L89)
## Задание 6: [Получение списка уникальных слов из списка строк, длина которых больше 4 символов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L98)
>> List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
## Задание 7: [Преобразование списка объектов класса в список их имен, отсортированных по возрасту](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L107)
>> List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
## Задание 8: [Нахождение суммы чисел, кратных 3 и 5, из списка чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L133)
## Задание 9: [Получение списка слов, содержащих только уникальные символы, из списка строк](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L142)

## **[HW_11102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_11102023/src/main/java/org/example)**

1.    * - [Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L8)
                private static void m1() {
                    List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
*************************************************************************************
2.    * - [Дан список целых чисел. Необходимо найти максимальный
          элемент списка, который делится на заданное число без остатка.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L22)
               private static void m2() {
                   List<Integer> lis  = Arrays.asList(10, 15, 20, 25, 30);
*************************************************************************************
3.    * - [Дана коллекция объектов класса Person. Класс Person содержит поля name и age.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_11102023/src/main/java/org/example/Person.java)
      * - [Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L39)
               private static void m3() {
                    List<Person> people = Arrays.asList(
                            new Person("John", 20),
                            new Person("Jane", 25),
                            new Person("Jack", 30),
                            new Person("James", 35),
                            new Person("Jill", 40)
                    );
*************************************************************************************
4.    * - [Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
           этой коллекции строк, и вернуть их в виде списка.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L70)
               private static void m4() {
                    List<String> lines = Arrays.asList(
                            "Java is a programming language.",
                            "Java is widely used in enterprise applications.",
                            "Python is gaining popularity as a data science tool.",
                            "Python is a versatile programming language."
                    );
*************************************************************************************
5.    * - [Подсчитать буквы в нижнем и верхнем регистре](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L96)
            String ss = "KikJhYggfTgf";
*************************************************************************************
6.    * - [Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L118)
             Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
             Optional<Map.Entry<Integer, List<String>>> max =
*************************************************************************************
7.    * - [Дан список сотрудников, у каждого из которых есть поле "salary".](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_11102023/src/main/java/org/example/Employee.java)
      * - [Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
            в компаниях, которые находятся в городах, начинающихся на букву "M".](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L132)   
*************************************************************************************
8.    * - [У нас есть список списков numbers,
            и мы хотим получить все четные числа из этих списков.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L158)
          Мы используем flatMap, чтобы преобразовать каждый внутренний
            список в поток чисел, а затем фильтруем только четные числа.
            Результат: Even numbers: [2, 4, 6].        
                  List<List<Integer>> numbers = Arrays.asList(
                          Arrays.asList(1, 2),
                          Arrays.asList(3, 4),
                          Arrays.asList(5, 6)
                  );
*************************************************************************************
9.    * - [Есть два списка list1 и list2, и мы
            хотим получить все возможные комбинации сумм чисел из обоих списков.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L186)
           Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
            затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
            и наконец, собираем все значения в combinedList.
           Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].
                  List<Integer> list1 = Arrays.asList(1, 2, 3);
                  List<Integer> list2 = Arrays.asList(4, 5, 6);
 ------------------------------------------------------------------------------------------------------------------------
 ## Для тех кому все лег ко  
 10.    * - Задача 1. : Найти k-ую перестановку из n элементов
        * - Дано число n и число k, необходимо найти k-ую перестановку из n элементов.

 11.    * - Задача 2: Разбить список на подсписки заданного размера
        * - Дан список элементов и размер подсписков. Необходимо разбить список
        *    на подсписки указанного размера.
------------------------------------------------------------------------------------------------------------------------
 ## Для людей-индиго
 12.    * - Найти сумму квадратов простых чисел, которые являются палиндромами в заданном диапазоне.

## **[HW_12102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_12102023/src/main/java/org/example/Main.java)**

## 1 уровень сложности: homework2709_23
1. - Сделать отдельный класс[LibraryManagerStream.java](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_12102023/src/main/java/org/example/LibraryManagerStream.java) там переписать все методы стримами
*************************************************************************************

## **[HW_16102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/Main.java)**  

## Тема: Оптимизация кода через параметризацию классов в системе управления задачами.

## Бизнес-логика:
Вы разрабатываете систему управления задачами для компании.
В системе существуют разные типы задач, такие как задачи срочного
выполнения и задачи с обязательным приоритетом. Каждая задача имеет
дедлайн, а также стоимость, которую компания платит за её выполнение.
Компания хочет оптимизировать свой код для управления задачами,
чтобы легко добавлять новые типы задач в будущем.

## Задание:
## Создайте базовый класс [Task](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/Task.java), который содержит следующие поля и методы:

Поля:
- title (название задачи)
- private Date deadline (срок выполнения)
- priority (приоритет)
- reward (стоимость выполнения)
Методы:
- Конструктор для инициализации полей.
- [Метод  public double calculatePayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/Task.java#L29), который будет возвращать стоимость выполнения задачи в зависимости от приоритета.

## Создайте [класс UrgentTask](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/UrgentTask.java), который наследуется от класса Task и добавляет следующую логику:
- У задачи срочного выполнения приоритет всегда равен 1.
- Дедлайн для задач срочного выполнения всегда равен сегодняшней дате.
- [Метод calculatePayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/UrgentTask.java#L18) переопределен так, чтобы стоимость выполнения задачи срочного выполнения была вдвое выше.

## Создайте [класс PriorityTask](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/PriorityTask.java), который наследуется от класса Task и добавляет следующую логику:
- Поле requiredPriority (требуемый приоритет для выполнения).
- Метод [calculatePayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/PriorityTask.java#L19) переопределен так, чтобы стоимость выполнения задачи считалась только если приоритет задачи соответствует требуемому.

## Создайте [класс TaskManager](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/TaskManager.java), который будет управлять задачами и оптимизировать код для управления ими.
- Параметризируйте класс таким образом, чтобы он мог работать с разными типами задач.
- Класс TaskManager должен содержать следующие методы:

- [Метод addTask(task: Task)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/TaskManager.java#L21), который добавляет задачу в систему.
- [Метод calculateTotalPayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/TaskManager.java#L25), который суммирует стоимость в ыполнения всех задач в системе.
  
## Создайте [примеры использования классов и их оптимизацию через параметризацию, а также примеры вычисления общей стоимости выполнения задач.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/Main.java)


## **[HW_23102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_23102023/src/main/java/org/example/Main.java)**  

**Подсчет общего числа имен в файле
[public long countTotalNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L45)

**Нахождение уникальных имен в файле
[public Set<String> uniqueNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L49)

**Подсчет числа имен, содержащих заданную подстроку
[public long countNamesContainingSubstring(String fileName, String substring)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L54)

**Нахождение имен, длина которых находится в заданном диапазоне
[public List<String> namesWithLengthInRange(String fileName, int minLength, int maxLength)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L61)

**Вывод первых N имен в алфавитном порядке
[public List<String> firstNNamesAlphabetically(String fileName, int n)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L68)

**Нахождение пяти самых часто встречающихся имен в файле
[public List<String> topFiveCommonNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L76)

**Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз
[public Set<String> namesStartingWithAndOccurMoreThanTwice(String fileName, char c)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L87)

**Нахождение двух имен с самой длинной и самой короткой длиной
[public Pair<String, String> longestAndShortestNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L100)

// Для этого метода потребуется [класс Pair](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_23102023/src/main/java/org/example/Paar.java):
public static class Pair<K, V> {
private K key;
private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

1 уровень сложности:

Сделать все что на уроке + почитать про алгоритм Луна (лУна а не лунА))) и написать [метод который генерирует 
стрингу состоящую из 16 цифр на карте+ месяц и год окончания срока действия + CVV (Например 12341234123412340929888)  по этому
алгоритму. Месяц и год должен быть в диапазоне от текущей даты + (4- 5 лет). Те срок карты должен истекать 
ОТ 2027 ПО 2028Т.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_23102023/src/main/java/org/example/CardNumberGenerator.java)
Прошу не пользоваться чатом GPT тк алгоритм простой и требует простого использования циклов.
Если в Википедии будет не понятно написано то посмотрите видео на ютюб про этот алгоритм - там все просто. 

## **[HW_25102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_25102023/src/main/java/org/example/Main.java)**  

*****Задание 1. Сериализация списка студентов
Описание: Создайте [класс Student](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_25102023/src/main/java/org/example/Students.java) с полями name
(имя студента), age (возраст) и grade (оценка).
Реализуйте сериализацию и десериализацию списка студентов.

Требования:
Используйте потоки для обработки данных.
Реализуйте [метод saveStudentsToFile(List<Student> students, String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L38), который будет сохранять список студентов в файл.
Реализуйте [метод List<Student> loadStudentsFromFile(String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L50), который будет читать студентов из файла.


*****Задание 2. Фильтрация студентов по оценке
Описание: Добавьте функционал, который позволит фильтровать студентов с оценкой выше определенного значения и сохранять их в отдельный файл.

Требования:
Реализуйте [метод filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L72C29-L72C29), который будет сохранять студентов с оценкой выше gradeThreshold в файл.


*****Задание 3. Средний балл студентов
Описание: Напишите метод, который вычисляет средний балл всех студентов из файла.

Требования:
Реализуйте [метод double calculateAverageGrade(String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L96), который возвращает средний балл студентов.

## **[HW_30102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java)**

## UNIT_TESTS

1. -  [Простое сложение двух чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L12)
2. -  [Вычитание](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L27)
3. -  [Умножение](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L43)
4. -  [Деление](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L55)
5. -  [Возведение в степень](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L82)
6. -  [Вычисление факториала](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L96)
7. -  [Определение четности числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L116)
8. -  [Поиск максимального числа в массиве](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L129)
9. -  [Определение простого числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L158)
10. -  [Перевод числа в строку с указанием системы счисления](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L179)
11. -  [Вычисление корня числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L196)
12. -  [Инвертирование строки](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L219)
13. -  [Проверка, является ли строка палиндромом](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L244)
14. -  [Вычисление НОД двух чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L258)
15. -  [Перемножение элементов массива](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L277)
16. -  [Определение длины самого длинного слова в строке](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L305)
17. -  [Конвертация температуры из Цельсия в Фаренгейт](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L325)
18. -  [Проверка на вхождение подстроки в строку (без использования стандартных методов Java)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L340)
19. -  [Сумма цифр числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L373)
20. -  [Проверка, является ли год високосным](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L392)

## **[HW_01112023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_01112023/src/test/java/org/example/LibraryTest.java)**

## 1. Написать тесты для методов класса Library.java

## Создаем:
1. -  [Создаем библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L8)
2. -  [Создаем авторов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L11)
3. -  [Создаем книги](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L15)

## Тестируем:
4. -  [Очищаем библиотеку и заполняем заново перед каждым запуском теста](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L20)
5. -  [Добавляем книгу в библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L29C11-L29C11)
6. -  [Удаляем книгу из библиотеки](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L45)
7. -  [Вытаскиваем по автору](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L59)
8. -  [Вытаскиваем сколько всего авторов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L66)
9. -  [Вытаскиваем по ISBN](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L73)
10. -  [Вытаскиваем по Title где в названии есть "Java"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L79)
11. -  [Добавляем копию книги в библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L86)
12. -  [Выдаем книжку из библиотеки](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L100)
13. -  [Возврат книги в библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L120)

# Home_Task_Java_Pro

## **[Helper](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/Helper/src/main/java/org/example)**

# **Описание задания.**

## **[HW_28082023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_28082023)**
## * 1 уровень сложности:
> ##  1. [Найти среднее арифметическое положительных элементов массива.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumPositivArrayElement.java)
> ##  2. [Найти сумму всех элементов в массиве, которые делятся на 3 и одновременно не делятся на 5.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumOfAllElemDiv3notSimDiv5.java)
> ##  3. [Найти в массиве наибольшую сумму подряд идущих элементов.n](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28082023/src/main/java/org/example/SumOfConsElem.java)

## **[HW_30082023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_30082023)**
## * 1 уровень сложности:
**Цель: Создать программу для управления списком товаров в интернет-магазине**

>1. Enums:
>> ## 1.1. [ProductCategory - Перечисление для представления категорий товаров в магазине:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/ProductCategory.java)
>> ## 1.2. [Size - Перечисление для представления размеров одежды:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Size.java)
>> ## [1.3. Currency - Перечисление для представления валют для цен товаров:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Currency.java)

>2. Классы:
>> ## [2.1. Product - Класс для представления товара:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Currency.java)
**Поля:**
* id (уникальный идентификатор товара)
* name (имя товара)
* category (категория товара из ProductCategory)
* price (цена товара)
* currency (валюта цены из Currency)
* Конструктор для   полей.

>> ## [2.2. Clothing - Подкласс класса Product для представления одежды:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/Clothing.java)
* Дополнительное поле size (размер одежды из Size).
* Конструктор для инициализации полей.

>> ## [2.3. ShopManager - Класс для управления списком товаров:](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30082023/src/main/java/org/example/ShopManager.java)

* Поле products (массив товаров).
* Метод addProduct(Product product) для добавления товара в список.
* Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории.
* Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
* заданном диапазоне цен и в указанной валюте.

## **[HW_06092003](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_06092023)**

# **Задача:**
> ## Разработать систему для управления оценками студентов и преподавателями в университете, используя язык программирования Java. Система должна включать в себя классы и интерфейсы для представления студентов, преподавателей и оценок, а также методы для работы с ними.

Функциональные требования:
===========================================
>> ## [Класс Person (Абстрактный класс):](HW_06092023/src/main/java/org/example/Person.java)
Создать абстрактный класс Person, который будет служить базовым классом для студентов и преподавателей.
Класс должен содержать следующие поля:
name (строка) - имя персоны.
age (целое число) - возраст персоны.
Класс Person должен иметь абстрактный метод getDescription(), который будет переопределен в подклассах.

====================================================

>> ## [Перечисление Grade (Enum):](HW_06092023/src/main/java/org/example/Grade.java)
Создать перечисление Grade для представления возможных оценок: A, B, C, D, F.
Интерфейс Graded:

===================================================
>> ## [Создать интерфейс Graded, который будет реализован классами, которые могут быть оценены. Интерфейс Graded должен содержать метод getGrade(), который будет возвращать оценку для объекта.](HW_06092023/src/main/java/org/example/Geraded.java)
====================================================
>> ## [Класс Student (наследник класса Person):](HW_06092023/src/main/java/org/example/Student.java)

Создать класс Student, который будет представлять студента.
Класс должен реализовать интерфейс Graded.
Класс Student должен содержать следующее поле:
grade (Grade) - оценка студента.
Класс Student должен переопределить метод getDescription(), чтобы возвращать информацию о студенте.

=====================================================
>> ## [Класс Teacher (наследник класса Person):](HW_06092023/src/main/java/org/example/Teacher.java)

Создать класс Teacher, который будет представлять преподавателя.
Класс Teacher не реализует интерфейс Graded.
Класс Teacher должен содержать следующее поле:
teacherGrade (Grade) - оценка, которую выставляет преподаватель студентам.
Класс Teacher должен иметь метод gradeStudent(), который будет выставлять оценку студенту. В данном ТЗ можно использовать случайное присвоение оценки студенту.
Класс Teacher должен переопределить метод getDescription() для вывода информации о преподавателе.

=========================================================================
>> ## [Класс GradeComparator (реализующий интерфейс Comparator):](HW_06092023/src/main/java/org/example/GradeComparator.java)

Создать класс GradeComparator, который будет реализовывать интерфейс Comparator<Student> для сравнения студентов по их
оценкам.
Класс должен содержать метод compare(), который сравнивает оценки двух студентов и возвращает результат сравнения.

=========================================================================
>> ## [Класс GradeManagementSystem:](HW_06092023/src/main/java/org/example/GradeManagementSystem.java)

Создать класс GradeManagementSystem, который будет управлять системой оценок в университете.
Класс GradeManagementSystem должен содержать следующие поля:
Массив объектов students (Student[]) - массив студентов.
Массив объектов teachers (Teacher[]) - массив преподавателей.
Класс GradeManagementSystem должен иметь методы:
processStudents() - метод для вывода информации о студентах (перебор массива студентов).
processTeachers() - метод для вывода информации о преподавателях (перебор массива преподавателей).
gradeStudents() - метод для автоматической выставления оценок студентам преподавателями
(используя метод gradeStudent() из класса Teacher).

## **Требования к реализации:**


Создать программу, которая демонстрирует работу системы управления оценками студентов и преподавателей.
Продемонстрировать использование интерфейсов, абстрактных классов, перечислений, массивов, циклов, сортировки с помощью интерфейсов Comparable и Comparator.
Программа должна быть читаемой и хорошо структурированной, с комментариями к ключевым частям кода.
Дополнительные задания (необязательные):

Реализовать более сложную логику для выставления оценок студентам в методе gradeStudent() класса Teacher.
Добавить возможность пользовательского ввода данных о студентах и преподавателях, а также вывод информации о студентах и преподавателях через консольный интерфейс.

## **[HW_13092003](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_13092023)**

## Уровень сложности 5 из 10

5.1 [Найти сумму всех элементов ArrayList<Integer>.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L8)
hw.getSum();

5.2 [Найти среднее значение элементов LinkedList<Integer>.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L22)
hw.getAvg();

5.3 [Перебрать ArrayList<String> и вывести все элементы на экран.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L38)
hw.ArrayList();

5.4 [Перебрать LinkedList<String> и найти самую длинную строку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L51)
hw.getLongestStreng();

5.5 [Создать ArrayList с объектами вашего собственного класса и вывести их на экран.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L69)
hw.doMyClassList();

## Уровень сложности 6 из 10:

6.1 [Перебрать ArrayList<Integer> и найти наименьший элемент.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L88)
hw.getMinElem();

6.2 [Перебрать LinkedList<Integer> и найти наибольший элемент.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L105)
hw.getMaxElem();

6.3 [Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L122)
hw.doArrayListStringStartC();

6.4 [Перебрать LinkedList<String> и найти первое вхождение определенной строки.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L141)
hw.doAnotherFirstLine();

6.5 [Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
удовлетворяющие определенному условию.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L165)
hw.doMyClassListDelElem();

## Уровень сложности 7 из 10:

7.1 [Перебрать ArrayList<Integer> и удалить все четные числа.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L197)
hw.doDelEvenElem();

7.2 [Перебрать LinkedList<Integer> и заменить все элементы, кратные 3, на нули.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L223)
hw.doReplaceElemMultiples3_zero();

7.3 [Перебрать ArrayList<String> и объединить все элементы в одну строку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L248)
hw.DoAllElemOneString();

7.4 [Перебрать LinkedList<String> и удалить все элементы, содержащие определенную подстроку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L267)
hw.getDelElemSpecificString();

7.5 [Создать ArrayList с объектами вашего собственного класса и вывести только те,
которые удовлетворяют определенному условию.(все кто старше 20 лет)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L298)
hw.doMyClassListSpecificPrint();

## Уровень сложности 8 из 10:

8.1 [Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L328)
hw.doSumSumSquaresAllNumbers();

8.2 [Перебрать LinkedList<Integer> и вычислить произведение всех элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L345)
hw.doProductAllNumbers();

8.3 [Перебрать ArrayList<String> и найти самую короткую строку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L362)
hw.getShortestString();

8.4 [Перебрать LinkedList<String> и заменить все гласные буквы в каждой строке на символ '*'.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L380)
hw.getReplacingVowelsWithStars();

8.5 [Создать LinkedList с объектами вашего собственного класса и отсортировать их в порядке убывания.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L403)
hw.getSortDescendingOrder();

## Уровень сложности 9 из 10

9.1 [Перебрать ArrayList<Integer> и найти второй по величине элемент.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L428)
hw.FindSecondLargestElement();

9.2 [Перебрать LinkedList<Integer> и вывести все элементы в обратном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L447)
hw.ElemReverseOrder();

9.3 [Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L469)
hw.getOnlyStringsWithLetters();

9.4 [Перебрать LinkedList<String> и найти самую длинную строку, не содержащую пробелов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L491)
hw.getlongestStringWithoutSpaces();

9.5 [Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L510)
hw.getOnlyUnicElem();

## Уровень сложности 10 из 10:

10.1 [Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L540)
hw.getFindLargestIncreasingSequenceElem();

10.2 [Перебрать LinkedList<Integer> и удалить все дубликаты элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L578)
hw.getDelAllDuplicateElem();

10.3 [Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L602)
hw.getOnlUniqueStrings();

10.4 [Перебрать LinkedList<String> и объединить все строки в одну с использованием разделителя.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L621)
hw.getAllDelimitedString();

10.5 [Создать LinkedList с объектами вашего собственного класса и отсортировать их по нескольким критериям.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/681d7d29c2bc7b40bcea3130ebf1cb98179be582/HW_13092023/src/main/java/org/example/Hw.java#L649)
hw.getMyListMitFullySorted();

## **[HW_18092003](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_18092023)**

1. [Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L9)
2. [Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L22)
3. [Переберите только значения в HashMap и TreeMap и найдите их среднее значение.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L41)
4. [Переберите HashMap и найдите ключ с максимальным значением.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L63)
5. [Переберите TreeMap и найдите ключ с минимальным значением.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L78)
6. [Переберите HashMap и удалите все элементы с четными значениями.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L93)
7. [Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L115)
8. [Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L135)
9. [Переберите HashMap и найдите ключ с максимальной суммой значений в его вложенных HashMap: HashMap<String, HashMap<String, Integer>>
   nestedHashMap = new HashMap<>();](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/28f9c103158c0bd3c2b1b70ab9c9878fa4009f44/HW_18092023/src/main/java/org/example/Hw.java#L151)

##  [HW_25092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_25092023)

- [Класс состоящий мз 4 полей разного типа](HW_25092023/src/main/java/org/example/Student.java)
- [Создать 10 объектов класса](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/a08f151b33f25ba8001ffb7572b51f5ee6240fc5/HW_25092023/src/main/java/org/example/Main.java#L8)
- [Поместить все с Хэш СЕт и вывести на экран](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/a08f151b33f25ba8001ffb7572b51f5ee6240fc5/HW_25092023/src/main/java/org/example/Main.java#L20)
- [Создайте TreeSet и найдите наименьший и наибольший элементы (int) в нем, перебирая элементы внутри набора.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/a08f151b33f25ba8001ffb7572b51f5ee6240fc5/HW_25092023/src/main/java/org/example/Main.java#L54)
- [Напишите метод, который принимает Set и находит все объекты, содержащие определенную подстроку(из поля стринг), перебирая элементы и используя
  метод contains.](HW_25092023/src/main/java/org/example/GetSearchSubStr.java)
  -[Напишите метод, которая удаляет все четные инт из HashSet и выводит оставшиеся элементы. Используйте итератор.](HW_25092023/src/main/java/org/example/GetDelEvenNum.java)
- [Создайте метод, который принимает два HashSet<Наш Класс> и возвращает новый HashSet, содержащий элементы, которые присутствуют в обоих множествах](HW_25092023/src/main/java/org/example/GetIntersection.java)

## **[HW_27092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example)**

## Техническое задание (ТЗ) №4: Управление задачами
## 1. Описание проекта
Цель проекта состоит в создании программы для управления задачами и
задачным списком. Проект будет включать минимум 3 класса с шестью полями
в каждом, а также класс для обработки задач с шестью методами, использующими циклы.

## 2. Классы
## 2.1. [Класс "Task"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/Task.java)
Поля:
- taskId (int): Уникальный идентификатор задачи.
- taskTitle (String): Название задачи.
- taskDescription (String): Описание задачи.
- taskPriority (int): Приоритет задачи (1 - низкий, 2 - средний, 3 - высокий).
- taskStatus (String): Статус задачи (открыта, в работе, завершена).
- taskDueDate (Date): Дата выполнения задачи.

## 2.2. [Класс "User"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/User.java)
Поля:
- userId (int): Уникальный идентификатор пользователя.
- userName (String): Имя пользователя.
- userEmail (String): Электронная почта пользователя.
- userTasks (List<Task>): Список задач, назначенных пользователю.
- userTaskList (Map<Date, List<Task>>): Список задач, сгруппированных по дате.

## 2.3. [Класс "TaskManager"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java)
Поля:
- taskList (List<Task>): Список всех задач.
- userList (List<User>): Список всех зарегистрированных пользователей.

## Методы:
1. [public List<Task> listHighPriorityTasks(): Метод, который возвращает список задач с
   высоким приоритетом.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L46)
2. [public List<Task> listTasksByStatus(String status): Метод, который возвращает список
   задач с указанным статусом.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L65)
3. [public Map<String, Integer> countTasksByStatus(): Метод, который возвращает отображение
   (Map) со статусами задач и количеством задач в каждом статусе.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L83)
4. [public void createTask(Task task): Метод, который создает новую задачу и добавляет ее в
   список задач.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L95)
5. [public void assignTask(User user, Task task): Метод, который назначает задачу пользователю.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L106)
6. [public void updateTaskStatus(Task task, String newStatus): Метод, котоый обновляет статус задачи.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/b50452fd4a60235f162e7cc3ab6379c588aa8de1/HW_27092023/src/main/java/org/example/TaskManager.java#L138)

## 3. Обработка данных
Задачи будут создаваться, назначаться, обновляться и фильтроваться с использованием
методов класса "TaskManager". Данные
о задачах и пользователях будут храниться в соответствующих объектах классов "Task" и "User".

## **[HW_28092023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_28092023/src/main/java/org/example)**

# **Описание задания.**

## Уровень сложности 1: Написать игру казино.
1. - В игре должна быть реализована возможность играть в рулетку и в автоматы типа 777. Можно делать ставки,
2. - менять ставки, смотреть сколько денег осталось итд…..все что захотите.
## Реализация версия 0.1
1. - [модуль Main.java основной модуль встречаем-выпроваживаем](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/Main.java)
2. - [модуль Clip.java чисто для создания атмосферы](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/Clip.java)
3. - [модуль AlcoholDrink.java чисто для поддержания атмосферы](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/AlcoholDrink.java)
4. - [модуль PlayRullette.java решение для игры рулетка](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/PlayRullette.java)
5. - [модуль Play777.java решение для игры 777](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_28092023/src/main/java/org/example/Play777.java)

## **[HW_04102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_04102023/src/main/java/org/example)**

## **[Past 1](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_04102023/src/main/java/org/example/Taski.java)**
1. - [Фильтрация списка целых чисел на нечетные числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L7)
2. - [Преобразование списка строк в список чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L16)
3. - [Суммирование списка чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L26)
4. - [Определение максимального значения в списке](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L35)
5. - [Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L44)
6. - [Получение списка уникальных слов из списка строк, длина которых больше 4 символов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L58)
7. - [Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L72)
8. - [Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L87)
9. - [Получение списка слов, содержащих только уникальные символы, из списка строк](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/334871c683a399983fe7928f3f4fab43025fd763/HW_04102023/src/main/java/org/example/Taski.java#L96)

## **[Past 2](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_04102023/src/main/java/org/example/TaskiAdd.java)**
1. - [Фильтрация четных чисел и умножение на 2.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L7)
2. - [Удаление дубликатов из списка строк.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L16)
3. - [Сортировка списка чисел в порядке убывания и выбор первых трех элементов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L23)
4. - [Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L30)
5. - [Пропуск первых двух элементов и вывод оставшихся.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L38)
6. - [Фильтрация чисел больше 50 и вывод их квадратов.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L44C8-L44C8)
7. - [Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L51C16-L51C16)
8. - [Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L58)
9. - [Получить среднее значение чисел в списке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L66)
10. - [Получить строку, объединяющую элементы списка через запятую.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L72)
11. - [Получить список квадратов чисел из другого списка.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L76)
12. - [Получить список букв из списка слов и вывести их в алфавитном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L82)
13. - [Получить первые 3 строки из списка и вывести их в обратном порядке.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L90)
14. - [Пропустить первые 2 элемента и оставить только уникальные.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L98)
15. - [Фильтрация и сортировка пользователей по возрасту.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/966931b374189290d128fabfc6d0bb48c845bc45/HW_04102023/src/main/java/org/example/TaskiAdd.java#L106)

class User {
private String name;
private int age;

     public User(String name, int age) {
         this.name = name;
         this.age = age;
    }
     public String getName() {
        return name;
    }
     public int getAge() {
         return age;
    }
}

## **[HW_09102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_09102023/src/main/java/org/example/Main.java)**

>>    * List<Integer> numbers = Arrays.asList(1.txt, 2, 3, 4, 5, 6, 7, 8, 9, 10);
>>    * -- [Отфильтровать нв четные и не четные](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L7)
>>    * -- [Просуммировать все числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L22)
>>    * -- [Получить среднее значение](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L28)
>>    * -- [Найти суммы чисел кратных 3 и 5](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L35)

>>    * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
>>    * -- [Преобразовать список строк в список чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L42)

>>    * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi")
>>    * -- [Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L49)
>>    * -- [Получить список слов которые содержат только уникальные символы](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L57)

## Задание 1: [Фильтрация списка целых чисел на нечетные числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L65)
>> List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
## Задание 2: [Преобразование списка строк в список чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L72)
>> List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
## Задание 3: [Суммирование списка чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L79)
>> List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
## Задание 4: [Определение максимального значения в списке](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L84)
## Задание 5: [Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистре](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L89)
## Задание 6: [Получение списка уникальных слов из списка строк, длина которых больше 4 символов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L98)
>> List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
## Задание 7: [Преобразование списка объектов класса в список их имен, отсортированных по возрасту](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L107)
>> List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
## Задание 8: [Нахождение суммы чисел, кратных 3 и 5, из списка чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L133)
## Задание 9: [Получение списка слов, содержащих только уникальные символы, из списка строк](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/4267898ee7f3bbcb07d2ceb8b29a6a4fc1779809/HW_09102023/src/main/java/org/example/Main.java#L142)

## **[HW_11102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_11102023/src/main/java/org/example)**

1.    * - [Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L8)
          private static void m1() {
          List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
*************************************************************************************
2.    * - [Дан список целых чисел. Необходимо найти максимальный
          элемент списка, который делится на заданное число без остатка.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L22)
          private static void m2() {
          List<Integer> lis  = Arrays.asList(10, 15, 20, 25, 30);
*************************************************************************************
3.    * - [Дана коллекция объектов класса Person. Класс Person содержит поля name и age.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_11102023/src/main/java/org/example/Person.java)
* - [Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L39)
    private static void m3() {
    List<Person> people = Arrays.asList(
    new Person("John", 20),
    new Person("Jane", 25),
    new Person("Jack", 30),
    new Person("James", 35),
    new Person("Jill", 40)
    );
*************************************************************************************
4.    * - [Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
          этой коллекции строк, и вернуть их в виде списка.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L70)
          private static void m4() {
          List<String> lines = Arrays.asList(
          "Java is a programming language.",
          "Java is widely used in enterprise applications.",
          "Python is gaining popularity as a data science tool.",
          "Python is a versatile programming language."
          );
*************************************************************************************
5.    * - [Подсчитать буквы в нижнем и верхнем регистре](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L96)
          String ss = "KikJhYggfTgf";
*************************************************************************************
6.    * - [Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L118)
          Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
          Optional<Map.Entry<Integer, List<String>>> max =
*************************************************************************************
7.    * - [Дан список сотрудников, у каждого из которых есть поле "salary".](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_11102023/src/main/java/org/example/Employee.java)
* - [Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
    в компаниях, которые находятся в городах, начинающихся на букву "M".](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L132)
*************************************************************************************
8.    * - [У нас есть список списков numbers,
          и мы хотим получить все четные числа из этих списков.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L158)
          Мы используем flatMap, чтобы преобразовать каждый внутренний
          список в поток чисел, а затем фильтруем только четные числа.
          Результат: Even numbers: [2, 4, 6].        
          List<List<Integer>> numbers = Arrays.asList(
          Arrays.asList(1, 2),
          Arrays.asList(3, 4),
          Arrays.asList(5, 6)
          );
*************************************************************************************
9.    * - [Есть два списка list1 и list2, и мы
          хотим получить все возможные комбинации сумм чисел из обоих списков.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/9e5b3c3a91d02361b4f485ba79c18eba10e3ad74/HW_11102023/src/main/java/org/example/Methods.java#L186)
          Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
          затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
          и наконец, собираем все значения в combinedList.
          Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].
          List<Integer> list1 = Arrays.asList(1, 2, 3);
          List<Integer> list2 = Arrays.asList(4, 5, 6);
 ------------------------------------------------------------------------------------------------------------------------
## Для тех кому все лег ко
10.    * - Задача 1. : Найти k-ую перестановку из n элементов
* - Дано число n и число k, необходимо найти k-ую перестановку из n элементов.

11.    * - Задача 2: Разбить список на подсписки заданного размера
* - Дан список элементов и размер подсписков. Необходимо разбить список
*    на подсписки указанного размера.
------------------------------------------------------------------------------------------------------------------------
## Для людей-индиго
12.    * - Найти сумму квадратов простых чисел, которые являются палиндромами в заданном диапазоне.

## **[HW_12102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_12102023/src/main/java/org/example/Main.java)**

## 1 уровень сложности: homework2709_23
1. - Сделать отдельный класс[LibraryManagerStream.java](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_12102023/src/main/java/org/example/LibraryManagerStream.java) там переписать все методы стримами
*************************************************************************************

## **[HW_16102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/Main.java)**

## Тема: Оптимизация кода через параметризацию классов в системе управления задачами.

## Бизнес-логика:
Вы разрабатываете систему управления задачами для компании.
В системе существуют разные типы задач, такие как задачи срочного
выполнения и задачи с обязательным приоритетом. Каждая задача имеет
дедлайн, а также стоимость, которую компания платит за её выполнение.
Компания хочет оптимизировать свой код для управления задачами,
чтобы легко добавлять новые типы задач в будущем.

## Задание:
## Создайте базовый класс [Task](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/Task.java), который содержит следующие поля и методы:

Поля:
- title (название задачи)
- private Date deadline (срок выполнения)
- priority (приоритет)
- reward (стоимость выполнения)
  Методы:
- Конструктор для инициализации полей.
- [Метод  public double calculatePayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/Task.java#L29), который будет возвращать стоимость выполнения задачи в зависимости от приоритета.

## Создайте [класс UrgentTask](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/UrgentTask.java), который наследуется от класса Task и добавляет следующую логику:
- У задачи срочного выполнения приоритет всегда равен 1.
- Дедлайн для задач срочного выполнения всегда равен сегодняшней дате.
- [Метод calculatePayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/UrgentTask.java#L18) переопределен так, чтобы стоимость выполнения задачи срочного выполнения была вдвое выше.

## Создайте [класс PriorityTask](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/PriorityTask.java), который наследуется от класса Task и добавляет следующую логику:
- Поле requiredPriority (требуемый приоритет для выполнения).
- Метод [calculatePayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/PriorityTask.java#L19) переопределен так, чтобы стоимость выполнения задачи считалась только если приоритет задачи соответствует требуемому.

## Создайте [класс TaskManager](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/TaskManager.java), который будет управлять задачами и оптимизировать код для управления ими.
- Параметризируйте класс таким образом, чтобы он мог работать с разными типами задач.
- Класс TaskManager должен содержать следующие методы:

- [Метод addTask(task: Task)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/TaskManager.java#L21), который добавляет задачу в систему.
- [Метод calculateTotalPayment()](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/0944dd91c9049633d43b5eb3fac088d31d9d059b/HW_16102023/src/main/java/org/example/TaskManager.java#L25), который суммирует стоимость в ыполнения всех задач в системе.

## Создайте [примеры использования классов и их оптимизацию через параметризацию, а также примеры вычисления общей стоимости выполнения задач.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_16102023/src/main/java/org/example/Main.java)


## **[HW_23102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_23102023/src/main/java/org/example/Main.java)**

**Подсчет общего числа имен в файле
[public long countTotalNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L45)

**Нахождение уникальных имен в файле
[public Set<String> uniqueNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L49)

**Подсчет числа имен, содержащих заданную подстроку
[public long countNamesContainingSubstring(String fileName, String substring)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L54)

**Нахождение имен, длина которых находится в заданном диапазоне
[public List<String> namesWithLengthInRange(String fileName, int minLength, int maxLength)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L61)

**Вывод первых N имен в алфавитном порядке
[public List<String> firstNNamesAlphabetically(String fileName, int n)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L68)

**Нахождение пяти самых часто встречающихся имен в файле
[public List<String> topFiveCommonNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L76)

**Нахождение имен, которые начинаются на заданную букву и встречаются больше двух раз
[public Set<String> namesStartingWithAndOccurMoreThanTwice(String fileName, char c)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L87)

**Нахождение двух имен с самой длинной и самой короткой длиной
[public Pair<String, String> longestAndShortestNames(String fileName)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_23102023/src/main/java/org/example/Main.java#L100)

// Для этого метода потребуется [класс Pair](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_23102023/src/main/java/org/example/Paar.java):
public static class Pair<K, V> {
private K key;
private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

1 уровень сложности:

Сделать все что на уроке + почитать про алгоритм Луна (лУна а не лунА))) и написать [метод который генерирует
стрингу состоящую из 16 цифр на карте+ месяц и год окончания срока действия + CVV (Например 12341234123412340929888)  по этому
алгоритму. Месяц и год должен быть в диапазоне от текущей даты + (4- 5 лет). Те срок карты должен истекать
ОТ 2027 ПО 2028Т.](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_23102023/src/main/java/org/example/CardNumberGenerator.java)
Прошу не пользоваться чатом GPT тк алгоритм простой и требует простого использования циклов.
Если в Википедии будет не понятно написано то посмотрите видео на ютюб про этот алгоритм - там все просто.

## **[HW_25102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_25102023/src/main/java/org/example/Main.java)**

*****Задание 1. Сериализация списка студентов
Описание: Создайте [класс Student](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_25102023/src/main/java/org/example/Students.java) с полями name
(имя студента), age (возраст) и grade (оценка).
Реализуйте сериализацию и десериализацию списка студентов.

Требования:
Используйте потоки для обработки данных.
Реализуйте [метод saveStudentsToFile(List<Student> students, String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L38), который будет сохранять список студентов в файл.
Реализуйте [метод List<Student> loadStudentsFromFile(String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L50), который будет читать студентов из файла.


*****Задание 2. Фильтрация студентов по оценке
Описание: Добавьте функционал, который позволит фильтровать студентов с оценкой выше определенного значения и сохранять их в отдельный файл.

Требования:
Реализуйте [метод filterAndSaveStudentsByGrade(List<Student> students, double gradeThreshold, String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L72C29-L72C29), который будет сохранять студентов с оценкой выше gradeThreshold в файл.


*****Задание 3. Средний балл студентов
Описание: Напишите метод, который вычисляет средний балл всех студентов из файла.

Требования:
Реализуйте [метод double calculateAverageGrade(String filename)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/77b0a917684522b82263adfc0107029968fc17e8/HW_25102023/src/main/java/org/example/Main.java#L96), который возвращает средний балл студентов.

## **[HW_30102023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java)**

## UNIT_TESTS

1. -  [Простое сложение двух чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L12)
2. -  [Вычитание](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L27)
3. -  [Умножение](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L43)
4. -  [Деление](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L55)
5. -  [Возведение в степень](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L82)
6. -  [Вычисление факториала](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L96)
7. -  [Определение четности числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L116)
8. -  [Поиск максимального числа в массиве](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L129)
9. -  [Определение простого числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L158)
10. -  [Перевод числа в строку с указанием системы счисления](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L179)
11. -  [Вычисление корня числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L196)
12. -  [Инвертирование строки](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L219)
13. -  [Проверка, является ли строка палиндромом](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L244)
14. -  [Вычисление НОД двух чисел](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L258)
15. -  [Перемножение элементов массива](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L277)
16. -  [Определение длины самого длинного слова в строке](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L305)
17. -  [Конвертация температуры из Цельсия в Фаренгейт](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L325)
18. -  [Проверка на вхождение подстроки в строку (без использования стандартных методов Java)](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L340)
19. -  [Сумма цифр числа](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L373)
20. -  [Проверка, является ли год високосным](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/7f60f5b6d471213f3cb82334686aa5140273d8d7/HW_30102023/src/test/java/org/example/taski/CalculatorTest.java#L392)

## **[HW_01112023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_01112023/src/test/java/org/example/LibraryTest.java)**

## 1. Написать тесты для методов класса Library.java

## Создаем:
1. -  [Создаем библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L8)
2. -  [Создаем авторов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L11)
3. -  [Создаем книги](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L15)

## Тестируем:
4. -  [Очищаем библиотеку и заполняем заново перед каждым запуском теста](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L20)
5. -  [Добавляем книгу в библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L29C11-L29C11)
6. -  [Удаляем книгу из библиотеки](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L45)
7. -  [Вытаскиваем по автору](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L59)
8. -  [Вытаскиваем сколько всего авторов](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L66)
9. -  [Вытаскиваем по ISBN](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L73)
10. -  [Вытаскиваем по Title где в названии есть "Java"](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L79)
11. -  [Добавляем копию книги в библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L86)
12. -  [Выдаем книжку из библиотеки](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L100)
13. -  [Возврат книги в библиотеку](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/67c788daca0302235bafdee5b05e55fc885dfb03/HW_01112023/src/test/java/org/example/LibraryTest.java#L120)

## **[HW_06112023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/tree/main/HW_06112023/src/test/java/taski)**

## Написать тесты для классов :
1. [Order](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_06112023/src/test/java/taski/OrderTest.java),
2. [Product](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_06112023/src/test/java/taski/ProductTest.java),
3. [User](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_06112023/src/test/java/taski/UserTest.java).

## **[HW_08112023](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_08112023/src/main/java/org/example/Methods.java)**

##  Написать методы и тесты для методов:

1. [Написать метод для задачи (если стоит решетка, то букву убираем, сколько решеток столько и букв убираем, после
   этого сравниваем равенство с эталонной строкой](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_08112023/src/main/java/org/example/Methods.java):
*
s1 = aaa // эталон
s2 = ##aaa###aaa
s1 = adga // эталон
s2 = aa#dg#gs##a
*
- [Написать тесты к методу](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_08112023/src/test/java/org/example/MethodsTest.java).

2. [Написать метод (Каждая буква это шаг в направлении вверх низ право лево. Проверка вернется ли в исходную ячейку):](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_08112023/src/main/java/org/example/Methods.java)
*
s = "LDLDRURU"
*
- [Написать тесты к методу](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_08112023/src/test/java/org/example/MethodsTest.java).

3. [Написать метод (Сколько букв из эталонного слова встречается в стринге):](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_08112023/src/main/java/org/example/Methods.java)
*
j = "ahT"
s = "uyayhhTyRthh"
*
- [Написать тесты к методу](https://github.com/DmitriDjourov/Home_Task_Java_Pro/blob/main/HW_08112023/src/test/java/org/example/MethodsTest.java).