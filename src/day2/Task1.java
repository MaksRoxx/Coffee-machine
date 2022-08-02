package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int count;

        Scanner in = new Scanner(System.in);
        System.out.print("Count floos in home: ");
        count = in.nextInt();
        if (count >= 1 && count <= 4) {
            System.out.println("Little home");
        } else if (count >= 5 && count <= 8) {
            System.out.println("Medium home");
        } else if (count < 1) {
            System.out.println("Error");
        } else if (count >= 9) {
            System.out.println("Big home");
        }
    }
}