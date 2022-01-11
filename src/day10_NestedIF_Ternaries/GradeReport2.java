package day10_NestedIF_Ternaries;

public class GradeReport2 {

    public static void main(String[] args) {
        int s = 135;

        String result = (s>=0 && s<=100)? (s>=90)? "Excellent" :(s>=80)? "Great" :(s>=70)? "good"
                :(s>=60)? "passed" : "Failed" : "Invalid";

        System.out.println("Score " + "= " + result);


    }
}
