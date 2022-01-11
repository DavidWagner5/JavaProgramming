package day14_StringAgain;
import java.util.Scanner;
/* Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number” */
public class AccountNumberEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account number");
        String AN = scan.nextLine();
        String result = "";
        char beginWith = AN.charAt(0);

        if(beginWith=='2'&& AN.length()==7){
            result = "valid account number";
        }else if(beginWith=='5' && AN.length()==7){
            result = "valid account number";
        }else{
            result = "Invalid number";

            scan.close();
        }
    }
}
