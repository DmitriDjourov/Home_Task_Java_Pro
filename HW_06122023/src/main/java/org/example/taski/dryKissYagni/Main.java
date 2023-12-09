package org.example.taski.dryKissYagni;

import java.time.LocalDate;
import java.util.Date;

public class Main {
		public static void main(String[] args) {
				String string = DateUtils.formatDateForDisplay(new Date());
				System.out.println(string);
				String string1 = DateUtils.formatDateTimeForDisplay(new Date());
				System.out.println(string1);

				String fullName = NewSU.formatName("Вася", "Пупкин");
				System.out.println("Full Name: " + fullName);
				String address = NewSU.formatAddress("123 Main St", "Cityville", "12345");
				System.out.println("Address: " + address);
				String formattedString = NewSU.formatString(fullName,address);
				System.out.println("Formatted String: " + formattedString);
		}
}
