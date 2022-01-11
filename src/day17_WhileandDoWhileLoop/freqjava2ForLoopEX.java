package day17_WhileandDoWhileLoop;
import java.util.Scanner;
/*4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create  */
public class freqjava2ForLoopEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Sentence");
        String Sentence = scan.nextLine();

        System.out.println("Enter your word");
        String word = scan.nextLine();

        int freq = 0;

        for (int i = 0; i <Sentence.length()-3; i++) {
            word = Sentence.substring(i, i + 4);

            if (word.equalsIgnoreCase("java")) {
                freq++;
            }


        }
        System.out.println(freq);

        scan.close();


    }
}
