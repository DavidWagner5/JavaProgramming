package day12_Scanner;
import java.util.Scanner;
public class GradereportEX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = input.nextInt();
        String result = "";

        if (score >= 0 && score <= 100){

            result = (score >= 90)? "Your grade is A" :(score >= 80)? "Your grade is B" :(score >= 70)? "Your grade is C"
                    :(score >= 60)? "Your grade is D" : "Your grade is F";

        }else{
            result = ("Invalid score");
        }
        System.out.println(result);

        input.close();

    }
}
/*
2. GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */

