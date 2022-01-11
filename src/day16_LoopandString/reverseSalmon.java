package day16_LoopandString;

public class reverseSalmon {
    public static void main(String[] args) {
        String word = "loveablesalmon";
        String reverse = "";

        for (int i = word.length()-1; i >=0; i--) {

            char ch = word.charAt(i);

            reverse += ch;






        }
        System.out.println("reverse = " + reverse);

        }
    }

