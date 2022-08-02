package itProger_course;

public class Lesson10 {
    public static void main(String[] args) {
        char[][] array = new char[3][];
        for (int i = 0; i < array.length; i++)
            array[i] = new char[3];
        array[0][0] = 'C';
        System.out.println(array[0][0]);
    }
}
