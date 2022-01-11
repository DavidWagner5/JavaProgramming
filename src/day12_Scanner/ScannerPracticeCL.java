package day12_Scanner;
//import java.util.*;  //* means wild import - it imports everything from util. don't use this because it will use a lot of memory
import java.sql.SQLOutput;

//you can do boolean, int, next which is one word, next line which is string of text, and double
import java.util.Scanner; //this is regular scanner
public class ScannerPracticeCL {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7");

        int num = (byte) scan.nextInt();
        String result = "";

        if (num >= 1 && num <= 7) {

            result = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" : (num == 5) ? "Friday"
                    : (num == 6) ? "Saturday" : "Sunday";


        } else {
            result = "invalid number";
        }


        System.out.println(result);

        scan.close();


    }
}
