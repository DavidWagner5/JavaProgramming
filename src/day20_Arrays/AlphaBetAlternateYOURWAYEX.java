package day20_Arrays;

import java.util.Arrays;

public class AlphaBetAlternateYOURWAYEX {
    public static void main(String[] args) {

        char[] alph = new char [26];

        for (char i = 0, j = 'Z';  i <alph.length ; i++ , j--) {  //i is the index nums, j are the chars
            alph[i] = j;




        }
        System.out.println(Arrays.toString(alph));


        for (char i = 'A'; i <= 'Z'  ; i++) {
            System.out.print(i+ " ");


        }
    }
}
