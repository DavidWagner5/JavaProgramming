package day53_FunctionalInterface_Stream;

public class LambaExpressions {

                //1. Create a function that takes a String and returns the reversed value of the given argument*/
    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
                    return reverse;
                };


        String result = stringReverse.D("Wooden Spoon");

        System.out.println(result);



      //-------------------------------------------------------------------------


        // 2. Create a function that takes one integer and returns the cube of the given argument
        MyThirdFunctionalInterface <Integer> cubeOfNumber = (c) -> {
            return c*c*c;

        };
        int cube = cubeOfNumber.D(5);
        System.out.println("cube = " + cube);




    }
}
