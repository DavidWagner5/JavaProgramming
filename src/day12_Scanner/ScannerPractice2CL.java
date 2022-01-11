package day12_Scanner;
import java.util.Scanner;
public class ScannerPractice2CL {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter true or false");
        boolean result = Scan.nextBoolean();

        Scan.close();

    }
}
