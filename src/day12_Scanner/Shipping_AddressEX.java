package day12_Scanner;
import java.util.Scanner;
public class Shipping_AddressEX {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = Scan.nextLine();

        System.out.println("Enter your building number");
        int num = Scan.nextInt();

        Scan.nextLine();

        System.out.println("Enter your Street name");
        String street = Scan.nextLine();

        System.out.println("enter your city name");
        String City = Scan.nextLine();

        System.out.println("Enter your state");
        String State = Scan.next();

        System.out.println("Enter your Zip code");
        String zip = Scan.next();



        System.out.println("Shipping Address: " +"\n" + name + "\n" + num + ", " + street + ", " + City + "\n" + State + "\n" + zip);


        Scan.close();







    }
}
