/*package itProger_course;

public class Lesson9 {
    public static void main(String[] args) {
//        int[] name = new int[5];
//        name[4] = 23;
//        name[1] = 23;
//        name[0] = 23;
        int[] name = new int[] {23, 34, 56};
        System.out.println(name[1]);
    }
}
*/
package itProger_course;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();
        a = new int [n];
        for (int i = 0; i < n; i += 1) {
            System.out.print("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }
    }
}