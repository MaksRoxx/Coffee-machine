package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number: ");
        int n = in.nextInt();

        int[] numbers = new int[n];
        int b = 0;
        int v = 0;
        int g = 0;
        int d = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
            if (numbers[i] > 8){
                b += 1;
            }
            if (numbers[i] == 0){
                v += 1;
            }
            if (numbers[i] % 2 == 0){
                g += 1;
            } else {
                d += 1;
            }
            sum += numbers[i];
        }
        System.out.println("Massiv long = " + n);
        System.out.println("Count numbers which more than 8 = " + b);
        System.out.println("Count numbers which equel one = " + v);
        System.out.println("Chet numbers = " + g);
        System.out.println("Ne chet numbers = " + d);
        System.out.println("Sum = " + sum);
    }
}
