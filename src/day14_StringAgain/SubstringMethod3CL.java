package day14_StringAgain;
import java.lang.String;
public class SubstringMethod3CL {

    public static void main(String[] args) {

        //subtring method
        //to get sub values of the string. small portion of the string.




        System.out.println("------------------");
        String word2 = "Java Programming Language";


        String s1 = word2.substring(0 , word2.indexOf(" "));//java

        String s2 = word2.substring( word2.indexOf(" ")+1 , word2.lastIndexOf(" ")); //programming

        String s3 = word2.substring( word2.lastIndexOf(" ")+1);//language

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


        String word3 = "CydeoSchool@gmail.com";

        String s4 = word3.substring(0 , word3.indexOf("@"));

        System.out.println("s4 = " + s4);

        String s5 = word3.substring(word3.lastIndexOf("@") +1);

        System.out.println("s5 = " + s5);


        System.out.println("-------------");



        int beginningIndex = word3.indexOf("@") +1;
        int EndingIndex = word3.lastIndexOf(".");

        String domain = word3.substring(beginningIndex , EndingIndex);

        System.out.println("domain = " + domain);

        System.out.println("------------------------");




        String str1 = "Java is fun, Java is cool, I love Java";

        String o1 = str1.substring(0 , 10+1);
        System.out.println("str1 = " + str1);

        int beg = str1.indexOf(" J") +1;
        int end = str1.lastIndexOf(",");

        String o2 = str1.substring(beg , end);

        String o3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println("o1 = " + o1);
        System.out.println("o2 = " + o2);
        System.out.println("o3 = " + o3);










    }
}
