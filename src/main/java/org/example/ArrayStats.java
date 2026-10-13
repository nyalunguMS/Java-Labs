package org.example;

public class ArrayStats {
    int[] numbers = {25, 60, 45, 80, 12, 55};

    public void calculateStats() {
        int largest = numbers[0];
        int smallest = numbers[0];
        int count = 0;
        int count50 = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            count++;

            if (numbers[i] >= 50) {
                count50++;
            }
        }
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
        System.out.println("Number of elements: " + count);
        System.out.println("Values greater or equal to 50: " + count50);
    }
}
