package day17_WhileandDoWhileLoop;

public class freqCharForLoopEX {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int freq = 0;


        for (int i = 0; i < str.length() ; i++) { //i = indexes of str

            char eachChar = str.charAt(i); // this will get me each character of the string

            if(ch == eachChar){
                freq++;
            }






        }

        System.out.println(freq);

    }




}
