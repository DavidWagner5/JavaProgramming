package day16_LoopandString;
//retrieve all letter digits and special chars.
public class DigitsLettersSpecialchars {
    public static void main(String[] args) {


        String w1 = "Cydeo12345School! @#$W";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < w1.length() ; i++) {

            char ch = w1.charAt(i);// this is getting all the chars in loop from "w1"

            if(ch>='0' && ch<='9'){
                digits += ch;
            }else if (ch>='a' && ch<='z' || ch>='A' && ch<= 'Z'){
                letters += ch;

            }else{
                if(ch != ' ') //this just ignores the space in my string variable
                specialChars+= ch;
            }




        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
