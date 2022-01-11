package day14_StringAgain;

public class StringMethods1CL {

    public static void main(String[] args) {
        //trim method

        String str1 = "   batch 25        ";
        str1.trim();

        str1 = str1.trim();

        System.out.println(str1);

        String test1 = "          hello   ";
        String tesst1 = test1.trim();
        System.out.println("tesst1 = " + tesst1);

        System.out.println("-------------------------------------");
        
        //index of method


        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h"); //finds number index of h

        System.out.println(n1);

        
        //or

        int n2 = str2.indexOf("ool");

        System.out.println("n2 = " + n2);

        //or


        String str3 = "Java Programming language";

        int n3 = str3.indexOf("amm");

        System.out.println(n3);

        int n4 = str3.indexOf("gua");

        System.out.println(n4);

        System.out.println("-----------------------------------");

        //last index.of method

        String str4 = "Hello my name is luke skywalker";

        int n5 = str4.lastIndexOf("e");

        int nn5 = str4.lastIndexOf("s");
        System.out.println("nn5 = " + nn5);

        System.out.println(n5);
        
        int n6 = str4.lastIndexOf("al");
        System.out.println("n6 = " + n6);



    }
}
