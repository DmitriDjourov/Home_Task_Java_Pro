package org.example.taski.dryKissYagni;//package org.example._2023_12_06.taski.dryKissYagni;

import java.util.List;

//public class DA {
//
//    public void processData(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size();
//        System.out.println("Average: " + average);
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = 0;
//        for (User user : users) {
//            //totalAge += user.getAge();
//        }
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }
//}

/**
 * В этом рефакторинге я вынес повторяющийся код в отдельные методы,
 * что уменьшает дублирование и делает код более читаемым.
 */
//public class DataAnalyzer {
//
//		public void processData(List<Integer> data) {
//				int sum = calculateSum(data);
//				double average = calculateAverage(data);
//
//				System.out.println("Sum: " + sum);
//				System.out.println("Average: " + average);
//		}
//
//		public void processUserData(List<User> users) {
//				int totalAge = calculateTotalAge(users);
//				double averageAge = calculateAverageAge(users);
//
//				System.out.println("Total Age: " + totalAge);
//				System.out.println("Average Age: " + averageAge);
//		}
//
//		private int calculateSum(List<Integer> numbers) {
//				int sum = 0;
//				for (int num : numbers) {
//						sum += num;
//				}
//				return sum;
//		}
//
//		private double calculateAverage(List<Integer> numbers) {
//				if (numbers.isEmpty()) {
//						return 0.0; // Avoid division by zero
//				}
//				return (double) calculateSum(numbers) / numbers.size();
//		}
//
//		private int calculateTotalAge(List<User> users) {
//				int totalAge = 0;
//				for (User user : users) {
//						totalAge += user.getAge();
//				}
//				return totalAge;
//		}
//
//		private double calculateAverageAge(List<User> users) {
//				if (users.isEmpty()) {
//						return 0.0; // Avoid division by zero
//				}
//				return (double) calculateTotalAge(users) / users.size();
//		}
//}
