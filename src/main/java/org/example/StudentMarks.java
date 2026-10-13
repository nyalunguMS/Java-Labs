package org.example;

public class StudentMarks {
    int[] marks = {75, 80, 65, 90, 85};

    public void displayMarks() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
            total += marks[i];
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + (double) total / marks.length);
    }
}
