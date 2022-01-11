package day09_IFandElsestatements;

public class MinimumnumberEX {

    public static void main(String[] args) {

        int number = 200;
        int number2 = 600;

        boolean numberisMin = number<number2;
        boolean number2isMin = number>number2;

        if(numberisMin){
            System.out.println("Number 1 is min");
        }else{
            System.out.println("Number 2 is min");
        }

    }
}
