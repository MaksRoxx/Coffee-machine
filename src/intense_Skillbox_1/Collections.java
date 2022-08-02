package intense_Skillbox_1;

import java.util.HashMap;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {


        HashMap<String, Integer> drinks = new HashMap<>();
        drinks.put("capuchino", 200);
        drinks.put("espresso", 100);
        drinks.put("water", 50);

        for (String key: drinks.keySet()) {
            System.out.println(key + " - " + drinks.get(key));
        }
    }
}
