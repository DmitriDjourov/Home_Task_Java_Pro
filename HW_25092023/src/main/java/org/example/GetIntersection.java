package org.example;

import java.util.HashSet;

public class GetIntersection {
		public static HashSet<Student> getIntersection(HashSet<Student> students, HashSet<Student> students2) {
				HashSet<Student> resultat = new HashSet<>();

				for (Student element : students) {
						if (students2.contains(element)) {
								resultat.add(element);
						}
				}

				return resultat;
		}
}
