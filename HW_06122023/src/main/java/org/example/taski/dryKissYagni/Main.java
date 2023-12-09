package org.example.taski.dryKissYagni;

import java.time.LocalDate;
import java.util.Date;

public class Main {
		public static void main(String[] args) {
				String string = DateUtils.formatDateForDisplay(new Date());
				System.out.println(string);
				String string1 = DateUtils.formatDateTimeForDisplay(new Date());
				System.out.println(string1);
		}
}
