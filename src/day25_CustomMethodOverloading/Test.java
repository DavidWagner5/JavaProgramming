package day25_CustomMethodOverloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {


        String str = "Java Programming Language";

        StringUtility.printEachChar(str);


        String str1 = "JAva programming language";

        System.out.println(StringUtility.Reverse(str1));

        String word = "civic";

        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        //checks how many palindromes in the array
        String[] namess = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;


        String str5 = "bca";
        String str6 = "acb";

        boolean anagram = StringUtility.Anagram(str6,str5);
        System.out.println(anagram);

        String str9 = "aaaaaaabbbbbbbbbbbcccccccc";

        System.out.println(StringUtility.removeDuplicates(str9));






        }


    }



