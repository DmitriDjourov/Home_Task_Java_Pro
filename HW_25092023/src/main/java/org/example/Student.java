package org.example;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
//- Класс состоящий мз 4 полей разного типа
public class Student {
		private String name;
		public int age;
		private  boolean bestStudent;
		private char grade;
}

