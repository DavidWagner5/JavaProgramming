package day13_String;
import java.lang.String;

//java.lang is the name for String package
//"hello" in this package is basically a char. it has an index number.
//index numbers start from 0

// for example
//"Cydeo"
// 01234
//String Literal means that String has double quotes. the strings like "Wooden Spoon."
//There are many strings we used stored in something called the string pool.
//String str = "Java";
//String str2 = "Java";
//These are both in the string pool.
public class StringintroCL {
    public static void main(String[] args) {

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name==name2);//true
        System.out.println(name2==name3);//true
        System.out.println(name3==name4);//true

        //these are all true, but now using "new" variable we assign new strings to string pools even though they are the same.
        //here is the new topic:

        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = new String("Java");

        System.out.println(str1==str2);//false
        System.out.println(str2==str3);//false
        System.out.println(str1.equals(str2));//this equals method just checks the value. so it will be true.

        //String Methods:

        //charAt(index): returns the character at the given index,returns char
        //length(): will return you the total number of the characters in your string.




    }
}
