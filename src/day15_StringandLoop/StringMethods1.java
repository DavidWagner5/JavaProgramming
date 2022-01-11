package day15_StringandLoop;

public class StringMethods1 {
    public static void main(String[] args) {


        String w1 = "  ";
        boolean w11 = w1.isEmpty();//false


        System.out.println("-------------------");


        String w2 = "     ";
        boolean w22 = w2.isBlank();//true // it wouldnt be black if it had characters in it

        System.out.println("--------------------");


        String w3 = "CYDEO";
        String w4 = "cydeo";

        System.out.println(w3.equals(w4));//false
        System.out.println(w3.equalsIgnoreCase(w4));//true

        System.out.println("------------------------");

        String sentence = "My favorite programming language is java";

        boolean s1 = sentence.contains("java"); //true
        boolean s2 = sentence.toUpperCase().contains("Java");//false
        boolean s3 = sentence.contains("java") || sentence.contains("Java");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


        System.out.println("------------------");

        String input1 = "I love java";
        String input2 = "Java";

        boolean e = input1.equalsIgnoreCase(input2);//false
        boolean e1 = input2.toLowerCase().contains("java");
        System.out.println("e1 = " + e1);//true

        System.out.println("---------------------------");
        String a = "Wooden Spoon";
        boolean a1 = a.startsWith("W");//true
        boolean a2 = a.endsWith("Spoon");//true
        boolean a3 = a.toLowerCase().startsWith("wooden");//true

        System.out.println("a3 = " + a3);



    }
}
