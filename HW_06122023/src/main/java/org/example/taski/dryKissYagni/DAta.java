package org.example.taski.dryKissYagni;

import java.util.List;

public class DAta {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        double standardDeviation = Math.sqrt(variance / numbers.size());

        return standardDeviation;
    }
}



class DataAnalyzer {

    public double calculateAverage(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.size();
    }

    public double calculateStandardDeviation(List<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        double average = calculateAverage(numbers);

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }

        return Math.sqrt(variance / numbers.size());
    }
}
