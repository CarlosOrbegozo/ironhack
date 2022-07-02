package com.ironhack;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {5,4,3,2,1};
//        numbers = multiplyingElements(numbers);
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

        reverseElements(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

    }

    public static int[] multiplyingElements(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i=0; i< numbers.length;i++) {
            if (i== numbers.length-1){
                result[i] = numbers[i]*numbers[0];
            }
            else {
                result[i] = numbers[i]*numbers[i+1];
            }
        }
        return result;
    }

    public static void reverseElements(int[] numbers) {
        for(int i = 0; i < numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }


}
