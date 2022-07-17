package InterviewPracticeTasks;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {


        String str = "Java";

        System.out.println(str.toUpperCase(Locale.ROOT));

        System.out.println(str.charAt(1));

        str = str.replace("J", "e");

        System.out.println(str);


String str1 = "I like java but my other java is better";

str1 = str1.replaceFirst("java", "dogs");

        System.out.println(str1);



//print hello world 5 times

        String str3 = "Hello world";

        for (int i = 1; i <= 5; i++) {

            System.out.println(str3);

        }


        }




    }

