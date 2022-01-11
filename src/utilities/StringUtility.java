package utilities;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class StringUtility {
    public static void main(String[] args) {




    }
    //prints each character of the given string
    public static String printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        return str;
    }


    //reverses the given string and returns the reversed string
    public static String Reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {

            result+= str.charAt(i);


        }
        return result;
    }

    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str) {

        return Reverse(str).equalsIgnoreCase(str);
    }


    //checks if the given string is an anagram, returns boolean like "acb" "bca"
    public static boolean Anagram(String str1, String str2){
        char [] ch1 = str1.toCharArray();
        char []  ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }


    //removes the duplicates from a given string, returns string "aaaaaabbbbbbbbcccccc ->> "abc"
    public static String removeDuplicates(String str){
       String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!(result.contains(""+each))){
                result +=each;
            }

        }
        return result;
    }








}



