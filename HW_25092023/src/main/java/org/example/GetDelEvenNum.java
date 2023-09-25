package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetDelEvenNum {
		public static void getDelEvenNum(Set<Integer> set) {
				Iterator<Integer> iterator = set.iterator();
				while (iterator.hasNext()) {
						int num = iterator.next();
						if (num % 2 == 0) {
								iterator.remove();
						}
				}
		}
}
