package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        double a, b;
        Scanner in = new Scanner(System.in);

        while (count <= 5) {
            count += 1;
            System.out.println("Enter number: ");
            a = in.nextDouble();
            System.out.println("Enter divider: ");
            b = in.nextDouble();

            if (b == 0) {
                System.out.println("Diviver = 0");
                continue;
            }

            System.out.println(a / b);
        }
        System.out.println("Thats all");
    }
}
