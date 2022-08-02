package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int max = -20000;
        int min = 20000;
        int zerco = 0;
        int sum = 0;
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(0, 10000);
        }

        for (int x:numbers){
            if (x > max){
                max = x;
            }
            if (x < min){
                min = x;
            }
            if (x % 10 == 0){
                zerco += 1;
                sum += x;
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(zerco);
        System.out.println(sum);
    }
}
