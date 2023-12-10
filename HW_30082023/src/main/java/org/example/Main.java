package org.example;


public class Main {
  public static void main(String[] args) {

    ShopManager shopManager = new ShopManager(4);//количество продуктов в магазине
    System.out.println("Ты мне тут ещё головой постучи! Не вишь шоль, у нас приёмка товара!");
    // добавляем продукты в магазин: все пропишутся, а вот последний должен отвалиться
    shopManager.addProduct(new Product(1, "Смартфон", ProductCategory.ELECTRONICS, 599.99, Currency.USD));
    shopManager.addProduct(new Product(2, "Мяч", ProductCategory.SPORTS, 9.99, Currency.USD));
    shopManager.addProduct(new Product(3, "Жигули", ProductCategory.SCRAP_METAL, 999.99, Currency.USD));
    shopManager.addProduct(new Product(4, "Брюки", ProductCategory.FOR_MENS, 9.99, Currency.ILS));
    shopManager.addProduct(new Clothing(5, "Маечка", ProductCategory.CLOTHING, 29.99, Currency.EUR, Size.M));
    System.out.println();
    // товары по категории
    Product[] electronics = shopManager.getProductsByCategory(ProductCategory.ELECTRONICS);
    System.out.println("Товары по категории.");
    for (Product prod : electronics) {
      System.out.println("Товар : " + prod.getName() + " | Цена : " + prod.getPrice() + " " + prod.getCurrency());
    }
    // товары по ценовому диапазону

    double minPrice = 5.00;
    double maxPrice = 10.00;
    Currency currency = Currency.USD;
    System.out.println();
    System.out.println("Товары по ценовому диапазону.");
    Product[] goodPrice = shopManager.getProductsByPriceRange(minPrice, maxPrice, currency);
    for (Product prod : goodPrice) {
      System.out.println("Товар : " + prod.getName() + " | Цена : " + prod.getPrice() + " " + prod.getCurrency());
    }
  }
}