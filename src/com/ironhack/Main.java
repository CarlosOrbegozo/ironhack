package com.ironhack;

import com.ironhack.classes.cat.Cat;
import com.ironhack.classes.courses.Course;
import com.ironhack.classes.pet.Pet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
//        Course course = new Course(1,10,30,"Ironhack");
//        System.out.println(course);

        Cat animal ;
        animal = new Cat("Robin");
        animal.makeAnAdorableSound();

        double taskEarning = 0.7;
        double taskFee = 0.1;

        int averageTaskByDayAndClient = 400;
        int averageClientByDay = 20000;

        System.out.println(new BigDecimal((taskEarning+taskFee)*averageTaskByDayAndClient*averageClientByDay *365));
        //320e por cliente y dia
        // 6,400,000 por dia
        // 2,099,200,000

        BigDecimal a = BigDecimal.valueOf(10);
        BigDecimal b = BigDecimal.valueOf(2);
        BigDecimal c = a.add(b);
        System.out.println(c);
        BigDecimal d = a.subtract(b);
        System.out.println(d);
        BigDecimal e = a.divide(b,4,RoundingMode.DOWN);
        System.out.println(e);
        BigDecimal f = a.multiply(b);
        System.out.println(f);
        BigDecimal g = a.remainder(b);
        System.out.println(g);

        System.out.println(operateFormulae(BigDecimal.valueOf(4)));



    }

    public static BigDecimal operateFormulae(BigDecimal x) {
        //(2.3 * x + 1.5) / (x - 0.8).
        BigDecimal part1 =BigDecimal.valueOf(2.3).multiply(x);
        BigDecimal part2 = part1.add(BigDecimal.valueOf(1.5));
        BigDecimal part3 = x.subtract(BigDecimal.valueOf(0.8));
        return part2.divide(part3,4, RoundingMode.DOWN);
        //return (BigDecimal.valueOf(2.3).multiply(x).add(BigDecimal.valueOf(1.5).divide((x.subtract(BigDecimal.valueOf(0.8))),4, RoundingMode.DOWN));
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
