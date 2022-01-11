package day08_LogicalOperatorsandIFStatements;

public class EligibletoVoteEX {

    public static void main(String[] args) {

        String name = "josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligibletoVote = age >= 21 && citizen == "USA";

        if(isEligibletoVote){

            System.out.println("Eligible");

        }

        if(!isEligibletoVote){
            System.out.println("Not Eligible");
        }
    }
}

