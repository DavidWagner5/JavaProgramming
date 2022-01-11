package day12_Scanner;
import java.util.Scanner;
/*1. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name */
public class MyinfoEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your Gender");

        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name");

        String fullName = scan.nextLine();

        System.out.println("Enter your phone number");

        long PhoneNumber = scan.nextLong();

        System.out.println("Enter your Zip code");

        int zipcode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your School name");

        String SchoolName = scan.nextLine();

        System.out.println("Enter your city name");

        String City = scan.nextLine();

        System.out.println("Enter your state name");

        String state = scan.nextLine();

        System.out.println("Enter your building number");

        int BuildingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String streetName = scan.nextLine();

        System.out.println(fullName + "\n" + age + "\n" + gender + "\n" + PhoneNumber + "\n" + BuildingNumber + ", " + streetName + "\n" + City + ", " + state +  " " + zipcode);

        scan.close();



    }
}
