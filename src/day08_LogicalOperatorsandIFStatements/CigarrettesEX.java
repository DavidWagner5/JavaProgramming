package day08_LogicalOperatorsandIFStatements;

public class CigarrettesEX {
//1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
    public static void main(String[] args) {

        byte age = 20;

        boolean isEligibleToBuy = age >= 21;

        if(isEligibleToBuy){

            System.out.println("Eligible");

        }
        if(!isEligibleToBuy){
            System.out.println("Not Eligible");
        }



    }
}
