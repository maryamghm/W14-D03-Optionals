package com.omar.exercise;

import java.util.Optional;
import java.util.Random;

public class Exercise {
    public static void main(String[] args) {

        Laptop laptopOptional1 =
                new Laptop("SN12345", true, true, null);

        // Exercise 1: Write a lambda using orElseGet() to default the price to $800 if the price is missing.
        // Print the output to confirm the price.
        System.out.println(laptopOptional1);

        int price = laptopOptional1.getPrice().orElseGet(()->800);
        laptopOptional1.setPrice(Optional.of(price));

        System.out.println(laptopOptional1);


        // Exercise 2: Write a method that takes in a Laptop object and returns true if the price is greater than $1200.



        // Exercise 3: Call the method that you created in Exercise 2 for the following Laptop objects and print out the
        // output.

        Laptop laptop1 =
                new Laptop("SN001", true, true, 1500);

        Laptop laptop2 =
                new Laptop("SN002", true, false, 1000);

        Laptop laptop3 =
                new Laptop("SN003", false, false, 700);


        System.out.println(checkPrice(laptop1));
        System.out.println(checkPrice(laptop2));
        System.out.println(checkPrice(laptop3));

        Random random = new Random();
        System.out.println(random.nextInt(6));
        System.out.println(random.nextInt(6));




    }

    public static boolean checkPrice(Laptop laptop){
        return laptop.getPrice().filter(price->price>1200).isPresent();
    }


}
