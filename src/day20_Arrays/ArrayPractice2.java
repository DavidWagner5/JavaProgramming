package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i = 'A', j = 0; i <= 'Z'; i++, j++) {  //i is the characters from a-z and j represents the index numbers. we use two variables so we don't have to write that shit out.
            letters[j] = i;

        }
        System.out.println(Arrays.toString(letters));


        //System.out.println("---------------");


        //or
        char ch = 'A';

        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch++;

        }

        System.out.println(Arrays.toString(letters));

        // System.out.println("-----------------");


    }


    }


