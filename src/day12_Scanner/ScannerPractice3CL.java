package day12_Scanner;
import java.util.Scanner;
public class ScannerPractice3CL {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = Scan.nextLine();

        System.out.println("Enter your language");
        String Programming = Scan.nextLine();

        System.out.println("Enter your age");
        int age = Scan.nextInt();

        Scan.nextLine(); //this somehow is needed after every next.int

        System.out.println("Enter your School");
        String school = Scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("Programming = " + Programming);
        System.out.println("age = " + age);
        System.out.println("school = " + school);

        Scan.close();


    }
}
