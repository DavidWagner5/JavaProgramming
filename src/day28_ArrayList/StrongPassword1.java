package day28_ArrayList;
/*PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit */
public class StrongPassword1 {
    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;


        char[] chars = password.toCharArray();       //or
                                                    // for (int i = 0; i < password.length(); i++){
                                                   //char each = password.charAt(i);

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            }
            if (Character.isLowerCase(each)) {
                r3 = true;
            }
            if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }


        }
        if (r2 == true && r3 == true && r4 == true && r1 == true && r5 == true) {
            System.out.println("You have a strong password");
        } else {
            System.out.println("Your password isn't strong enough");
        }


    }
}

