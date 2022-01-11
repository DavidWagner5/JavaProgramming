package day07_Operators;

import java.sql.SQLOutput;

public class UnaryOperatorsCL {

    public static void main(String[] args) {
        //These are just operators to indicate positive and negative numbers. + is optional one

        int num1 = +25;
        int num2 = -25;
        //pre increment ops
        int a = 5;
        System.out.println(a++);




        //now a becomes 6
        System.out.println(a);

        --a;

        //now a becomes 5 again

        System.out.println(a);

        int b = 100;
        System.out.println(++b);


        //---------------
        //post increment ops
        //post has 2 steps. it only increases or decreases after the first code

        int c = 100;
        System.out.println(c++);
        System.out.println(c);

        int x = 200;
        System.out.println(x--);
        System.out.println(x);

        int z = 45;
        System.out.println(++z);//increases right away
        System.out.println(z++);//second degree raise
        System.out.println(z);//now it's 47

        int u = 50;
        System.out.println(--u);//49
        System.out.println(++u);//back to 50


    }
}
