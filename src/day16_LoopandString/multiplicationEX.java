package day16_LoopandString;
/*3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200 */
public class multiplicationEX {
    public static void main(String[] args) {

        int pos1 = 6;
        int pos2 = 2;
        int result = 0;

        if (pos1 > 0 && pos2 > 0) {
            for (int i = 1; i <= pos1; i++) {

                result += pos2;

                System.out.println("result = " + result);

            }

        }else{
            System.out.println("invalid");
        }
    }
    }






