package day14_StringAgain;

public class Stringmeth {
    public static void main(String[] args) {
        
        String word = "Cydeo School";
        String result = "";
        
        String n1 = word.substring(0 , 4+1);
        System.out.println("n1 = " + n1);

        String n2 = word.substring(word.lastIndexOf(" S"));
        System.out.println("n2 = " + n2);

        result = n1 + n2;
        System.out.println("result = " + result);

    }
}
