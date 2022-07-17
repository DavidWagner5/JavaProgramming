package InterviewPracticeTasks;

public class Palindrome {
    public static void main(String[] args) {


        String word1 = "racecar";


        String reversed1 = "";

        for (int i = word1.length() - 1; i >= 0; i--) {

            reversed1 += word1.charAt(i);


        }

        if (reversed1.equals(word1)) {

            System.out.println("String is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
