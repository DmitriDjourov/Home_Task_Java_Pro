package org.example.taski.dryKissYagni;
public class Employee {
    private String firstName;
    private String lastName;
    
    public String getFullName() {

        return firstName + " " + lastName;
    }
    
    public String getInitials() {

        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }
    
    // Дублирование кода формирования email
    public String getEmail() {

        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}

/**
 * Чтобы избежать дублирования, можно вынести общую часть формирования электронной почты в отдельный метод.
 * добавление проверок на null
 */
class NewEmployee {
    private String firstName;
    private String lastName;

    public NewEmployee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return (firstName != null ? firstName : "") + " " + (lastName != null ? lastName : "");
    }

    public String getInitials() {
        String firstInitial = (firstName != null && !firstName.isEmpty()) ? firstName.substring(0, 1) + "." : "";
        String lastInitial = (lastName != null && !lastName.isEmpty()) ? lastName.substring(0, 1) + "." : "";
        return firstInitial + lastInitial;
    }

    public String getEmail() {
        return generateEmail(firstName, lastName);
    }

    private String generateEmail(String firstName, String lastName) {
        String sanitizedFirstName = (firstName != null) ? firstName.toLowerCase() : "";
        String sanitizedLastName = (lastName != null) ? lastName.toLowerCase() : "";
        return sanitizedFirstName + "." + sanitizedLastName + "@company.com";
    }
}
