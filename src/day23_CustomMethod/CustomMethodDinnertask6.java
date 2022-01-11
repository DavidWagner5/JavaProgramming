package day23_CustomMethod;

public class CustomMethodDinnertask6 {
    public static void main(String[] args) {

        eligibleToVote(18,"us");
    }

    public static void eligibleToVote(int age, String Citizenship){

        if(age>=18 && Citizenship.equalsIgnoreCase("US")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");

        }
    }
}
