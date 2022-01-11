package day08_LogicalOperatorsandIFStatements;

public class GradeReportEX {

    public static void main(String[] args) {

        System.out.println(true == !false); //true
        System.out.println(!true != false); //false
        System.out.println(!false == true); //true


        int score = 85;

        boolean a = score>=90 && score <=100;
        boolean b = score >= 80 && score <= 89;
        boolean c = score >=70 && score <=79;
        boolean d = score >=60 && score <=69;
        boolean f = !a && !b && !c && !d;

        if(a) { //if the student got an a.

            System.out.println("Excellent");
        }

        if(b){//if student got a b.

        System.out.println("Great");}



        if(c){  //if student got a c

        System.out.println("Good");}



        if(d){ //if student got a d

        System.out.println("Passed");}


        if(f){ //if student got an f
        System.out.println("Failed");}

    }
}
