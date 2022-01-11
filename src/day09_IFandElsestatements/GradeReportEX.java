package day09_IFandElsestatements;
//Grades A-F
public class GradeReportEX {
    public static void main(String[] args) {

        String grade = "A";
        String Report;

        if(grade=="A"){
           Report = "Excellent";
        }else if(grade=="B"){
            Report = "Great";
        }else if(grade=="C") {
            Report = "Good";
        }else if(grade=="D"){
            Report = "Pass";
        }else{
            Report = "Fail";

        }
        System.out.println("Grade = " + grade);
    }
}
/* OR  package day09_IfStatements;

public class Grade {
    public static void main(String[] args) {

        int score=9;
        String grade;
        if(score<=100 && score>=90){
            grade="A";
        }else if(score<=89 && score>=75){
            grade="B";
        }else if(score<=74 && score>=65){
            grade="C";
        }else if(score<=64 && score>=55){
            grade="D";
        }else{
            grade="F";
        }
        System.out.println("Your grade based on the "+score+" is "+grade+".");
    }
}  */