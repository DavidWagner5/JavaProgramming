package day17_WhileandDoWhileLoop;

public class ContinueStatementEX {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {   //to find all even numbers between 1-10

            if(i%2!=0){
                continue;
            }

            System.out.println(i);

        }
    }
}
