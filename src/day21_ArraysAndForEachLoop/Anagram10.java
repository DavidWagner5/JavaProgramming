package day21_ArraysAndForEachLoop;

import java.util.Arrays;

public class Anagram10 {
    public static void main(String[] args) {




        String str1 [] = {"a", "c" ,"d" ,"b"};
        String str2 [] = {"d","c", "b" ,"a"};

        Arrays.sort(str1);
        Arrays.sort(str2);

        boolean result = Arrays.equals(str1,str2);
        System.out.println(result);

        //----------------------------------------------------

        String str3 = "acdb";
        String str4 = "dcba";

        char ch1 [] = str3.toCharArray();
        char ch2 [] = str4.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean does = Arrays.equals(ch1,ch2);
        System.out.println(does);

    }
}
