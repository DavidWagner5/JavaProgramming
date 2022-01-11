package day09_IFandElsestatements;

public class Muilt_branchifCL {
//multibranch if = when there are three or more options/possibilities. Only one statement gets executed. the others must be false.
    //you can have 1 if, 5 else if, 1 else statements. only more else if.
    public static void main(String[] args) {

        int n = 100;

        if(n>0){
        System.out.println("Positive");}

        if(n<0){
        System.out.println("Negative");}

        if(n==0){
        System.out.println("zero");}

        //-----------------------------------------------------
        boolean positive = n>0;
        boolean negative = n<0;
        if(positive){
            System.out.println("Positive");
        }else if(negative){
            System.out.println("Negative");
        }else{
            System.out.println("zero");
        }



    }
}
