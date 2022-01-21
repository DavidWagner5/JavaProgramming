package day41_Exceptions;

import day33_Statics.Student;

import java.io.FileInputStream;
import java.util.Locale;

//it is important to know if an exceptions is checked or unchecked, you do not need to memorize each exception
//unchecked exceptions occur during the run time
//checked happen when you see compile errors before you run it
public class Checked_vs_Unchecked {
    public static void main(String[] args) {


        int a = 10;
        int b = 0;

        //System.out.println(a/b);

       // System.out.println("Wooden Spoon"); // you see this because the error happened before it

        //---------------------------------------------------------------

        char[] characters = {'A', 'B', 'C'};

        //System.out.println(characters[99]); //out of bounds exception, unchecked

        //------------------------------------------

        String str = "Wooden Spoon";

        str = null;

       // System.out.println(str.toUpperCase();

        //------------------------------------------checked exceptions----------------------


        System.out.println("Hello");

      //  Thread.sleep(3000); // this is a checked exception, it requires immediate attention. you wont be able to compile your code

        System.out.println("Cydeo");


        //FileInputStream file = new FileInputStream("path of the file");









    }

}
