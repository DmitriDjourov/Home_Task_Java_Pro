package org.example.taski.dryKissYagni;

public class Product {
    private String name;
    private double price;
    
    public void saveToDatabase() {
        // Сохранение товара в базу данных
    }
    
    public void generateInvoice() {
        // Генерация счета для товара
    }
    
    // Избыточный метод, который не связан с товаром
    public void sendEmailConfirmation() {
        // Отправка электронного письма с подтверждением
    }
}

/**
 *  рефакторинг . делим на более мелкие классы, каждый из которых будет выполнять свою ответственность
 */
//public class Product {
//    private String name;
//    private double price;
//
//    public void saveToDatabase() {
//        // Сохранение товара в базу данных
//    }
//
//    public void generateInvoice() {
//        // Генерация счета для товара
//    }
//}
//
//public class EmailSender {
//    public void sendEmailConfirmation(Product product) {
//        // Отправка электронного письма с подтверждением для товара
//    }
//}
