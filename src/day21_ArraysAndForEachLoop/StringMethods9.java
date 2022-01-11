package day21_ArraysAndForEachLoop;

import java.util.Arrays;
//toCharArray method
//split method
public class StringMethods9 {
    public static void main(String[] args) {




        String str = "Java";
        char [] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));


        for (char each :chars){
            System.out.println(each);
        }
        //------------------------------------------------

        String sentence = "Wooden Spoon";

      String words []  =  sentence.split(" ");

        System.out.println(Arrays.toString(words));


        //--------------------------------------------

        String email = "WoodenSpoon@cydeo.com";
        String word1 [] = email.split("@");

        System.out.println(Arrays.toString(word1));



    }
}
