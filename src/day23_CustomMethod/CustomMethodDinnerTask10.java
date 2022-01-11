package day23_CustomMethod;

import java.util.Arrays;

/*14. create a method named printEachElement that can print each elements of an integer array */
public class CustomMethodDinnerTask10 {
    public static void main(String[] args) {

        EachElement(new int[]{1, 2, 3, 4,5,6,7});
    }


    public static void EachElement(int element []){



        for (int each : element){

            System.out.println(each);
        }
    }
}
