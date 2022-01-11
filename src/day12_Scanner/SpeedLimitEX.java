package day12_Scanner;
import java.util.Scanner;
/* Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed,
if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down! */

public class SpeedLimitEX {


    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String result = "";

        System.out.println("Enter the speedLimit");
        int limit = Scan.nextInt();

        System.out.println("Enter Current Speed");
        int speed = Scan.nextInt();

        result = (speed>70)? "You're going too fast. slow down" : " ";

        System.out.println(result);








    }
}
