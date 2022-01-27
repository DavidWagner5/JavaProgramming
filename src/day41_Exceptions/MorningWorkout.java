package day41_Exceptions;
import utilities.sleepMethod;
/*1. Do 30 push-ups and try pausing 1.5 seconds in each*/
public class MorningWorkout {

    public static void main(String[] args) {
        System.out.println("Push up started");


        for (int i = 1; i <= 30 ; i++) {
            System.out.println("push up" + i);

            sleepMethod.sleep(1.5);

        }




        for (int i = 1; i <= 20 ; i++) {
            System.out.println("pull up" + i);


            sleepMethod.sleep(2.5);



        }







    }

}
