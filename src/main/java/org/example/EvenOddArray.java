package org.example;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArray {
    int[] num = {0,12,23,10,11,25};
    List<Integer> odd = new ArrayList<>();
    List<Integer> even = new ArrayList<>();

    void displayValues(){
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2 == 0){
                even.add(num[i]);
            }else{
                odd.add(num[i]);
            }
        }
        System.out.println("Even values: "+ even);
        System.out.println("Odd values: "+ odd);
    }



}
