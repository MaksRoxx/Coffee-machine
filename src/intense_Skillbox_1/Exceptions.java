package intense_Skillbox_1;

public class Exceptions {
    public static void main(String[] args) {
        int[] drinkPrices = {200, 100, 50};

        System.out.println("BEFORE");

        try {
            System.out.println(drinkPrices[3]);
        } catch (Exception ex) {
            System.out.println("Exception :(");
        }

        System.out.println("AFTER");
    }
}
