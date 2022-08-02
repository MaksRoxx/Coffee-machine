package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x, y;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        x = in.nextDouble();
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (-3 < x && x < 5) {
            y = (x + 3)*(x * x - 2);
        } else {
            y = 420;
        }
        System.out.println(y);
    }
}
