package day23_CustomMethod;
/*5. create a method that can calculate the grade of the student based on the score */
public class CustomMethodDinnerTask7 {
    public static void main(String[] args) {
  TestScore(72);

    }

    public static void TestScore(int score){

        String result = (score>=91)? "Your Grade is A" :(score<=90 && score>=81)? "Your grade is B" :(score<=80 && score>=75)? "Your grade is C"
                :(score<=74 && score>=70)? "Your grade is D " : "Your grade is F";

        System.out.println(result);

    }
}
