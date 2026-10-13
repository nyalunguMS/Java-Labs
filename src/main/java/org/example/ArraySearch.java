package org.example;

public class ArraySearch {

    int[] numbers = {10, 25, 30, 10, 40, 25};
    int target = 10;

    public void searchArray() {
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Value found at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Value not found");
        }
    }
}
