package org.example;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
				this.name = name;
				this.age = age;
		}

		@Override
		public String toString() {
				return "name =" + name +
						       " age=" + age;
		}
}