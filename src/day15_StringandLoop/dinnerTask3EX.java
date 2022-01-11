package day15_StringandLoop;
/*3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275  */
public class dinnerTask3EX {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i < 700; i++) {

            sum +=i;

            System.out.println("sum = " + sum);

        }
    }


}
