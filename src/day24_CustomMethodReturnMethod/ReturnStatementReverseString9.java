package day24_CustomMethodReturnMethod;

public class ReturnStatementReverseString9 {
    public static void main(String[] args) {

       String result = "";
        result = reverse("Java");


    }


    public static String reverse (String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {    //it starts at length()-1 which is the last character.  and then add charAt to i
            reverse += str.charAt(i);



        }

        return reverse;
    }




}
