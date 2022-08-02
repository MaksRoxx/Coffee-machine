import java.util.Scanner;

// 3
/*class HelloW {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
 */
// 4
/*import java.lang.String;
class HelloW {
    public static void main(String[] args) {
        byte num = 23;
        int num_1 = -20000;

        short num_2 = 32761;
        long num_3 = 1014891796;

        float num_4 = 23.45f;
        double num_5 = 234.1251511414d;

        boolean istrue = true;
        char simba = 'R';

        String str = "Hello World!";

        System.out.println(str);
    }
}
*/
// 5
/*
package com.company;
import java.util.Scanner;

public class HellowW {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Your string is: " + str.nextLine());
    }
}
 */
//6
/*
import java.util.Scanner;

public class HellowW {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter first num: ");
        first = num.nextInt();
        System.out.println("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        System.out.println("Result is - " + result);
    }
}
*/
//7
/*
public class HellowW {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 50;
        boolean isTrue = true;
        System.out.print("Enter first num: ");
        first = num.nextInt();

        isTrue = first == 51 ? true : false;

        if (first >= second || isTrue) {
            System.out.print("Num is 10");
            System.out.print("\n");
        } else if (first == 45) {
            System.out.print("Num is equal 45 ");
        }
        else {
            System.out.println("Num is lowwer than " + second);
        }

        switch (first) {
            case 51:
                System.out.print("Num is equal 51");
                break;
            case 57:
                System.out.print("Num is equal 57");
                break;
            default:
                System.out.println("Num is equal something");
        }
    }
}
*/
// 8
/*
public class HellowW {

    public static void main(String[] args) {
        //for (int i = 1; i <= 10; i++)
        //    System.out.println(i);

        boolean isTrue = true;
        int j = 0;
        while (j < 100) {
            j += 1;
            if (j % 2 == 0)
                continue;
            System.out.println(j);
        }

//        int x = 0;
//        do {
//            System.out.println(x);
//        } while (x < 0);
    }
}
*/