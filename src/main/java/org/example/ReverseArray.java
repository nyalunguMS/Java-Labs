package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    int[] numbers = {0,12,23,10,11,25};
    List<Integer> reversed = new ArrayList<>();

    void displayValues() {
        for (int i = numbers.length -1 ; i >= 0; i--) {
            reversed.add(numbers [i]);
        }
        System.out.println("List: "+ Arrays.toString(numbers));
        System.out.println("List reversed: "+ reversed);

    }


}
