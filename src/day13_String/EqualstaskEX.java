package day13_String;
import java.util.Scanner;
/*6. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method*/
public class EqualstaskEX {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = scan.next();
        scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.nextLine();
        scan.close();
        String result = "";

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            result = "Logged in";
        } else {
            result = "Incorrect username or password";
        }
        System.out.println(result);


    }
}
