package org.example;

import java.util.ArrayList;
import java.util.List;

public class EvenOddArray {
    int[] num = {0,12,23,10,11,25};
    int odd = 0;
    int even = 0;
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void displayValues(){
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2 == 0){
                evenList.add(num[i]);
                even++;
            }else{
                oddList.add(num[i]);
                odd++;
            }
        }
        System.out.println("Number of even values: "+even);
        System.out.println("Number of odd values: "+even);
        System.out.println("Even values: "+ evenList);
        System.out.println("Odd values: "+ oddList);
    }



}
