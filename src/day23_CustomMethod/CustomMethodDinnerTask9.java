package day23_CustomMethod;
/*13. create a method named printEachChar that can print each characters of a string */
public class CustomMethodDinnerTask9 {
    public static void main(String[] args) {

eachChar("Ladida");


    }
    public static void eachChar(String word){


        for (int i = 0; i <= word.length() ; i++) {
            char ch = word.charAt(i);
            System.out.println(ch);
        }

    }
}
