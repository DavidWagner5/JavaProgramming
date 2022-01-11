package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {
    public static void main(String[] args) {


        //create 100 pizza objects:  size - "S", cheese topping should be 2, and pepporoni topping should be 3

        ArrayList<Pizza> pizzas = new ArrayList<>();

        //create 100 more pizza objects size "M", 3 cheese toppings and 4 pepporoni toppings
        //create 100 pizza objects size "L", cheese toppings 4 and 5 pepporoni toppings

        for (int i = 0; i < 100; i++) {

            Pizza small = new Pizza("S", 2, 3);
            Pizza medium = new Pizza("M", 3,4);
            Pizza large = new Pizza("L", 4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }

        System.out.println("Total nums of pizza: " + pizzas.size());
        double totalPrice = 0;

        for (Pizza each : pizzas) {
            totalPrice += each.calcCost();

        }
        System.out.println(totalPrice);

    }
}
