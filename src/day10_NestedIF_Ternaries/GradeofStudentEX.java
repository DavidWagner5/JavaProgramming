package day10_NestedIF_Ternaries;

public class GradeofStudentEX {

    public static void main(String[] args) {
        int Score = 150;

        if (Score >= 0 && Score <= 100) { //this is a pre-condition

            if(Score>=90){
                System.out.println("Excellent");
            }else if(Score>=80){
                System.out.println("great");
            }else if(Score>=70){
                System.out.println("good");
            }else if(Score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid Score");
        }


    }


}