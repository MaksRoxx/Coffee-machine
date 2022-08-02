package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b;
        while (true) {
            System.out.println("Enter number: ");
            a = in.nextDouble();
            System.out.println("Enter divider: ");
            b = in.nextDouble();

            if (b == 0) {
                System.out.println("Shit");
                break;
            } else {
                System.out.println(a / b);
            }
        }
    }
}
