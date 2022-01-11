package day08_LogicalOperatorsandIFStatements;

public class IfStatementsCL {
    //if an "if" statement is false, it is executed completely. meaning it is not necessary.
    // single if, if & else, multi-branch if, nested if
    public static void main(String[] args) {

        int number = 300;

       boolean evenNumber = number % 2 == 0;


       if(evenNumber){  //if 300 is an even number than print it!, if it was 301, it wouldn't even print.
           System.out.println(number + " is even number");

       }


       int n = 200; //let's indicate if it's positive negative or equal to zero

        if(n>0){
            System.out.println(n+ " is positive"); //this one WILL print
        }
        if (n<0){
            System.out.println(n+ " is negative");// this one won't print because it's false

        }

        if (n==0){
            System.out.println(n+ " is equal to zeo"); //this one won't print because it's false
        }
    }

}
