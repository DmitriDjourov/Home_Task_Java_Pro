package org.example.taski.dryKissYagni;

import java.util.List;

public class D1 {
		public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
				double sumOfAllValues = 0;
				for (double currentValue : listOfNumbers) {
						sumOfAllValues += currentValue;
				}
				return sumOfAllValues / listOfNumbers.size();
		}
}

class DataProcessor  {
		/**
		 * Вычисляет среднее значение для данного списка чисел.
		 *
		 * @param listOfNumbers Список чисел, для которых нужно вычислить среднее значение.
		 * @return Среднее значение чисел в списке.
		 * @throws IllegalArgumentException Если список пуст.
		 */
		public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
				double sumOfAllValues = 0;
				if (listOfNumbers.isEmpty()) {// проверка на пустой список, что бы не было деления на ноль
						throw new IllegalArgumentException("List cannot be empty");
				}
				for (double currentValue : listOfNumbers) {
						sumOfAllValues += currentValue;
				}
				return sumOfAllValues / listOfNumbers.size();
		}
}