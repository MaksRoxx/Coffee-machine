package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner in = new Scanner(System.in);
        System.out.println("Number one: ");
        a = in.nextInt();
        a += 1;
        System.out.println("Number two: ");
        b = in.nextInt();
        for (; a < b; a++){
            if (a % 5 == 0 && a % 10 != 0)
                System.out.println(a);
        }
    }
}
