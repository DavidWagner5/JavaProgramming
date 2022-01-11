package day15_StringandLoop;
/*1. Write a program that can return the sum of even numbers between 1 to 100 */
public class dinnerTask1EX {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i <100 ; i++) {

            if(i%2==0){
                sum+=i;
            }
            System.out.println("sum = " + sum);
        }
    }
}
