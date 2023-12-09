package org.example.taski.dryKissYagni;

public class ProductService {
    public void addProduct(Product product) {
        // Добавление товара
    }

    public void updateProduct(Product product) {
        // Обновление товара
    }

    public void deleteProduct(Product product) {
        // Удаление товара
    }

    public double calculatePrice(Product product) {
        // Вычисление цены товара
        return 0;
    }
}

/**
 * рефакторинг.
 * разделение функций на несколько классов с соответствующими ответственностями.
 * функции, связанные с базой данных (добавление, обновление, удаление товара), перенесены в отдельный класс
 * класс PricingService отвечает только за вычисление цены товара.
 */
 class NewProduct {
    private String name;
    private double price;

    // Геттеры, сеттеры и другие методы

    // ... Остальной функционал товара ...
}

 class ProductRepository {
    public void addProduct(Product product) {
        // Добавление товара в базу данных
    }

    public void updateProduct(Product product) {
        // Обновление товара в базе данных
    }

    public void deleteProduct(Product product) {
        // Удаление товара из базы данных
    }
}

 class PricingService {
    public double calculatePrice(Product product) {
        // Вычисление цены товара
        return 0; // Заглушка, замените на реальную логику
    }
}
