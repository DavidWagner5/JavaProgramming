package day20_Arrays;

import java.util.Arrays;

public class AlphabetEX {
    public static void main(String[] args) {

        char[] alph = new char[26];

        alph[0] = 'z';
        alph[1] = 'y';


        //in order to use loop and not have to print all that stuff.

        char ch = 'Z';

       for (int i = 0; i < alph.length ; i++ , ch--) {
            alph[i] = ch;

        }




        System.out.println(Arrays.toString(alph)); //this will print entire array
        System.out.println(alph[0]);//this print just z


    }
}

