package day15_StringandLoop;
/*2. Write a program that can return the sum of odd numbers between 1 to 100 */
public class dinnerTask2EX {
    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i <100 ; i++) {

            if(i%3==0){
                sum+=i;
            }
            System.out.println("sum = " + sum);

        }


    }
}
