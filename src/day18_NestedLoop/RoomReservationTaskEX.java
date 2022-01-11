package day18_NestedLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RoomReservationTaskEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int totalPrice = 0;


        while (true) {

            System.out.println("Which bedroom would you like to reserve?");
            String room = scan.next();

            while (!(room.equals("king") || room.equals("Queen") || room.equals("single"))) {
                System.err.println("invalid entry, please enter room again");
                room = scan.next();
            }

            System.out.println("How many nights are you staying?");
            int nights = scan.nextInt();

            while (!(nights >= 1 && nights <= 10)) {
                System.err.println("invalid number of nights, enter again");
                nights = scan.nextInt();
            }


            totalPrice += (room.equals("King Bed") ? nights * 120 : (room.equals("Queen bed")) ? nights * 100 : nights * 80);

            System.out.println("would you like to reserve another room?");
            String a = scan.next();

            if (a.equals("no")) {
                break;
            }

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid answer. Please enter yes or no");
                System.out.println("Would you like to reserve another room?");
                a = scan.next();

            }


        }
        System.out.println("Your total price is: $" + totalPrice);
        scan.close();
    }
}
