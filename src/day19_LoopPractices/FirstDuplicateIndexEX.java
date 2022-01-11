package day19_LoopPractices;
import java.util.Scanner;
public class FirstDuplicateIndexEX {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String firstDupIndex = "";

        for (int k = 0; k < str.length(); k++) {


        char ch = str.charAt(k);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // each char of str check
            if (ch == each) {
                count++;
            }

        }
        if (count == 1) {continue;}
        firstDupIndex += ch + "";

    }
            System.out.println("firstDupIndex = " + firstDupIndex);
            System.out.println(str.indexOf(firstDupIndex.charAt(0)));
}


    }

