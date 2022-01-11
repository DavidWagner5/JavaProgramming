package day14_StringAgain;

public class StringMethod2CL {

    public static void main(String[] args) {

        //replace method

        String str = "Java is fun, I love learning Java";

        str = str.replace("Java" , "Python");

        String i = str.replace("is" , "isn't");
        System.out.println("i = " + i);

        System.out.println(str);


        String str2 = "David is divid and divid can be luke skywalker";

        str2 = str2.replace("David is " , "");

        System.out.println("str2 = " + str2);

        String str5 = "dog dog dog dog dog dog";
        str5 = str5.replace("dog" , "cat");
        System.out.println("str5 = " + str5);
        
        String str6 = "C# is fun, C# is cool";
        str6 = str6.replace("C# is f" , "Java is f");
        System.out.println("str6 = " + str6);
        
        String str7 = "Java";
        str7 = str7.replace("a" , "e");


        System.out.println("------------------");
        //replace.first method
        
        String str8= "Java Java Java Java";
        
        str8 = str8.replaceFirst("Java" , "Python");
        System.out.println("str8 = " + str8);
        
        String str9 = "Java";
        str9 = str9.replaceFirst("va" , "vo");

        System.out.println("str9 = " + str9);


        System.out.println("---------------------------");
        //Most popular method = substring method


        
    }
}
