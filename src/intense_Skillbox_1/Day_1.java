package intense_Skillbox_1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args) {
        System.out.println("Coffee machine");
        int moneyAmount = 120;

        ArrayList<Product> products = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("products.txt"));
            for (String line : lines) {
                String[] tokens = line.split("\s+");
                String name = tokens[0];
                int price = Integer.parseInt(tokens[1]);
                Product product = new Product(price, name);
                products.add(product);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        checkPrice(products, moneyAmount);
    }

    public static void checkPrice(ArrayList<Product> products,int moneyAmount){

        boolean canBuyAnything = false;

        for (Product product : products) {
            if (moneyAmount >= product.getPrice()){
                System.out.println("You can buy: " + product.getName());
                canBuyAnything = true;
            }
        }

        if (!canBuyAnything) {
            System.out.println("Oh no! You cant buy anything");
        }
    }
}