package day10_NestedIF_Ternaries;

public class EligibleToBuyEX {

    public static void main(String[] args) {
        int age =25;
        boolean hasID = true;

        if (hasID){//if they have id

            if (age >= 21){
                System.out.println("Eligible to Buy");//if the person is 21 or older
            }else{
                System.out.println("Not Eligible to buy");//if the person is less than 21
            }
        }else{
            System.out.println("Person does not have ID");
        }

    }
}
