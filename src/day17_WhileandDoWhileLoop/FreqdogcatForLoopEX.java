package day17_WhileandDoWhileLoop;
import java.util.Scanner;
/*5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true */
public class FreqdogcatForLoopEX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your sentence");
        String sentence = scan.nextLine();
        System.out.println("Write your word");
        String W1 = scan.nextLine();
        System.out.println("Write your word2");
        String W2 = scan.nextLine();
        int W1freq = 0;
        int W2freq = 0;

        for (int i = 0; i < sentence.length()-2; i++) {

            W1 = sentence.substring(i, i+3);
            W2 = sentence.substring(i, i+3);

            if(W1.equalsIgnoreCase("Dog")){
                W1freq ++;



            }
            if(W2.equalsIgnoreCase("Cat")){
                W2freq ++;



            }



            }
           boolean Answer = W1freq==W2freq;
        System.out.println(Answer);


        scan.close();


            }



        }








