package day20_Arrays;

import java.util.Arrays;

/*2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c */
public class DinnerTask2 {
    public static void main(String[] args) {

        String[]names={"Enes","Aykhan","Riza","Huseyin","Ozgul","Aohongjang","Victoria","Jonida","Asyl","Yasir"};
        String reverseNames [] = new String[names.length];

        for (int i = names.length - 1, j=0; i >= 0; i--, j++) {

           reverseNames[j] = names[i];
        }
        System.out.println(Arrays.toString(reverseNames));






        /* for (int i = 0; i < names.length; i++) {
            for (int j = names[i].length() - 1; j >= 0; j--) {
                reverseNames = "" + names[i].charAt(j);

                System.out.print(reverseNames);
            }
            System.out.p*/





    }

    }


