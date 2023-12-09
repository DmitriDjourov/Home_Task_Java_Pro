package org.example.taski.dryKissYagni;

public class UserValidation {
    public boolean validateUsername(String username) {
        // Проверка на длину имени
        if (username.length() < 6 || username.length() > 20) {
            return false;
        }
        
        // Проверка на наличие специальных символов
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }
        
        return true;
    }
    
    public boolean validateEmail(String email) {
        // Проверка на длину email
        if (email.length() < 6 || email.length() > 50) {
            return false;
        }
        
        // Проверка на наличие символа '@'
        if (!email.contains("@")) {
            return false;
        }
        
        return true;
    }
}
/**
 * рефакторинг.
 * Созданы константы для минимальной и максимальной длины имени пользователя и адреса электронной почты.
 * Созданы отдельные методы для проверки длины, наличия символов и проверки на валидные символы.
 * методы isLengthValid, containsValidCharacters, containsSymbol для уменьшения дублирования кода.
 */
class NewUserValidation {

    private static final int MIN_USERNAME_LENGTH = 6;
    private static final int MAX_USERNAME_LENGTH = 20;
    private static final int MIN_EMAIL_LENGTH = 6;
    private static final int MAX_EMAIL_LENGTH = 50;

    public boolean validateUsername(String username) {
        return isLengthValid(username, MIN_USERNAME_LENGTH, MAX_USERNAME_LENGTH)
                   && containsValidCharacters(username);
    }

    public boolean validateEmail(String email) {
        return isLengthValid(email, MIN_EMAIL_LENGTH, MAX_EMAIL_LENGTH)
                   && containsSymbol(email, '@');
    }

    private boolean isLengthValid(String value, int minLength, int maxLength) {
        return value.length() >= minLength && value.length() <= maxLength;
    }

    private boolean containsValidCharacters(String value) {
        return value.matches("^[a-zA-Z0-9]+$");
    }

    private boolean containsSymbol(String value, char symbol) {
        return value.contains(String.valueOf(symbol));
    }
}
