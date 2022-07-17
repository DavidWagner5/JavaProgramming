package InterviewPracticeTasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str3 = "acdb";
        String str4 = "dcba";

        char ch1 [] = str3.toCharArray();
        char ch2 [] = str4.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean does = Arrays.equals(ch1,ch2);
        System.out.println(does);


        String arr [] = {"michael", "burstein", "Nigger", "Faggot"};

        System.out.println(Arrays.toString(arr));
    }
}
