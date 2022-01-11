package day12_Scanner;
import java.util.Scanner;
public class NextLinePracticeEX {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("enter age: ");
        int age = Scan.nextInt();

        Scan.nextLine();

        System.out.println("enter full name: ");
        String name = Scan.nextLine();

        System.out.println("Enter your GPA:");
        double GPA = Scan.nextDouble();

        Scan.nextLine();

        System.out.println("Enter School name: ");
        String School = Scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("GPA = " + GPA);
        System.out.println("School = " + School);

        Scan.close();


    }
}
