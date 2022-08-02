package somevideo;

import java.util.Random;

public class number_generation {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 100; i++){
            System.out.println(rand.nextInt(8, 10));
//            System.out.println(Math.round(Math.random()*10));
        }
    }
}
