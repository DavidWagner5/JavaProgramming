package day09_IFandElsestatements;

public class EligibleforALCEX {

    public static void main(String[] args) {

        byte age = 50;

        boolean EligibletoBuy = age>=21;


        if(EligibletoBuy){
            System.out.println("Person is Eligible to buy Alcohol");
        }else{
            System.out.println("Not Eligible to buy Alcohol");
        }
    }
}
