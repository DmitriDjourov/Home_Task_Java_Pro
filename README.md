# Home_Task_Java_Pro

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
