package org.example;
/*  2.2. Clothing - Подкласс класса Product для представления одежды:
  Дополнительное поле size (размер одежды из Size).
  Конструктор для инициализации полей.*/
public class Clothing extends Product {
  private Size size;

  public Clothing(int id, String name, ProductCategory category, double price, Currency currency, Size size) {
    super(id, name, category, price, currency);
    this.size = size;
  }

  public Size getSize() {
    return size;
  }

  public void setSize(Size size) {
    this.size = size;
  }
}