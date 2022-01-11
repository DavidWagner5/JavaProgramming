package day17_WhileandDoWhileLoop;

public class BrancingStatementContinueCL {
    public static void main(String[] args) {

        for (char i = 'A'; i <='Z' ; i++) {

            if(i=='C'){
                continue;
            }
            System.out.println(i);

        }
    }
}
