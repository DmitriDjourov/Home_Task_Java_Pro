package org.example;

import java.util.Arrays;

public class ShopManager {
  /*  2.3. ShopManager - Класс для управления списком товаров:

    Поле products (массив товаров).
    Метод addProduct(Product product) для добавления товара в список.
    Метод getProductsByCategory(ProductCategory category) для получения списка товаров по заданной категории.
    Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка товаров в
    заданном диапазоне цен и в указанной валюте.
    методы надо написать....естественно))*/

  private Product[] products;// Поле products (массив товаров).
  private int countProd;

  public ShopManager(int maxNumOfProd) {
    products = new Product[maxNumOfProd];//товаров максимально может быть добавлено в магазин
    countProd = 0;
  }

  public void addProduct(Product product) {//Метод addProduct(Product product) для добавления товара в список.
    if (countProd < products.length) {//если есть место, то добавляем в магазин
      products[countProd] = product;
      countProd++;
      System.out.println(countProd + "-й товар успешно добавлен.");
    } else {
      System.out.println( "Этот товар уже принять не моху, а то ща магазин лопнет! ");
    }
  }

  public Product[] getProductsByCategory(ProductCategory category) {//Метод getProductsByCategory
    // (ProductCategory category) для получения списка
    // товаров по заданной категории.
    Product[] ProductsByCategory = new Product[countProd];
    int count = 0;
    for (int i = 0; i < countProd; i++) {
      if (products[i].getCategory() == category) {//идем в геттер оттуда в конструктор оттуда в поле,
        // а оно типа ProductCategory
        ProductsByCategory[count] = products[i];   // присваеваем в каунторный индекс массива найденный продукт
        count++;
      }
    }
    return Arrays.copyOf(ProductsByCategory, count); // возвращаем массив выбранных продуктов
  }

  public Product[] getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
    //Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка
    // товаров в заданном диапазоне цен и в указанной валюте.

    Product[] ProductsByPrice = new Product[countProd];
    int count = 0;
    for (int i = 0; i < countProd; i++) {
      if (products[i].getPrice() >= minPrice && products[i].getPrice() <= maxPrice
              && products[i].getCurrency() == currency) {
        ProductsByPrice[count] = products[i];
        count++;
      }
    }
    return Arrays.copyOf(ProductsByPrice, count);// возвращаем массив выбранных продуктов
  }
}




/*
   Product[] products;// Поле products (массив товаров).
   int countProd;

  public ShopManager(int maxNumOfProd) {
    this.products = new Product[maxNumOfProd];//товаров максимально может быть добавлено в магазин
    this.countProd = 0;
  }

  public void addProduct(Product newProduct) {//Метод addProduct(Product product) для добавления товара в список.
    if (countProd < products.length) {//если есть место, то добавляем в магазин
      products[countProd] = newProduct;
      countProd++;
      System.out.println(countProd + "-й товар успешно добавлен.");
    } else {
      countProd++;
      System.out.println(countProd + "-й товар принять не моху, а то ща магазин лопнет! \n");
    }
  }


  public Product[] getProductsByCategory(ProductCategory category) {//Метод getProductsByCategory
    // (ProductCategory category) для получения списка
    // товаров по заданной категории.
    Product[] ProductsByCategory = new Product[countProd];
    int count = 0;
    for (int i = 0; i < countProd; i++) {
      if ( products[i].getCategory() == category) {//идем в геттер оттуда в конструктор оттуда в поле,
        // а оно типа ProductCategory
        ProductsByCategory[count] = products[i]; // присваеваем в каунторный индекс массива найденный продукт
        count++;
      }
    }
    return ProductsByCategory;// возвращаем массив выбранных продуктов
  }

 public Product[] getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) {
    //Метод getProductsByPriceRange(double minPrice, double maxPrice, Currency currency) для получения списка
    // товаров в заданном диапазоне цен и в указанной валюте.

    Product[] ProductsByPrice = new Product[countProd];
    int count = 0;
    for (int i = 0; i < countProd; i++) {
      if (products[i].getPrice() >= minPrice && products[i].getPrice() <= maxPrice
              && products[i].getCurrency() == currency) {
        ProductsByPrice[count] = products[i];
        count++;
      }
    }
    return ProductsByPrice;// возвращаем массив выбранных продуктов
  }
}*/
