package com.ironhack;

import com.ironhack.classes.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {


    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {
        int[] numbers = {5, 4, 3, 2, 1};
//        numbers = multiplyingElements(numbers);
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        reverseElements(numbers);
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Introduce phrase: ");
//        String phrase = scanner.nextLine();
////        System.out.println("Welcome " + name);
//        countWordsStartingWithVowel(phrase);

//        FileWriter fileWriter = new FileWriter("demo.txt",true);
//        fileWriter.write("fsdfdsfsfs\n");
//        fileWriter.write("ewrewrewr\n");
//        fileWriter.close();
//        processCSVFile("oscar_age_female.csv");
        Course course = new Course(1,10,30,"Ironhack");
        System.out.println(course.toString());


    }

    public static void processCSVFile(String path) throws IOException {
        StringBuilder sb = new StringBuilder();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int lineCount = 0;
        String[] headers = null;
        while (scanner.hasNextLine()){
            if(lineCount==0) {
                headers = scanner.nextLine().split(", ");
            } else {
                String[] values = scanner.nextLine().split(", ");
                for (int i = 0; i< values.length-1;i++){
                    sb.append(headers[i]).append(": ").append(values[i]).append("\n");
                }
                sb.append("===========================\n");
            }
            lineCount++;
        }
        scanner.close();

        FileWriter fileWriter = new FileWriter("result.txt",true);
        fileWriter.write(sb.toString());
        fileWriter.close();
    }

    public static int countWordsStartingWithVowel(String phrase) {
        int count = 0;
        String pattern = "^[aeiou].*$";
        for (String s: phrase.toLowerCase().split(" ")) {
            //if (s.startsWith("a") || s.startsWith("e") || s.startsWith("i") || s.startsWith("o") || s.startsWith("u")) count++;
            if (Pattern.matches(pattern,s)) count++;
            else System.err.println("Not starting with vowel: "+ s);
        }
        System.out.println("Total count words starting with vowels: "+count);
        return count;
    }

    public static int[] multiplyingElements(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                result[i] = numbers[i] * numbers[0];
            } else {
                result[i] = numbers[i] * numbers[i + 1];
            }
        }
        return result;
    }

    public static void reverseElements(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
    }



}
