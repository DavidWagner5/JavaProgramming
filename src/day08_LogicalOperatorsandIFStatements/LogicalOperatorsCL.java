package day08_LogicalOperatorsandIFStatements;

public class LogicalOperatorsCL {
    //    &&: both expressions must be true in order for a true result
    //    ||: or expressions. only one must be true in order to be true


    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
                             //true                  //false

        System.out.println(name + "is eligible to vote: " + isEligible);

        //--------------------------------

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int momsAge  = 40;

        boolean isEligible2 = creditScore > 700 && age2 >= 20 && momsAge > 30;

        System.out.println(name2 + " Is Eligible: " + isEligible2);

        //--------------------------

        String name3 = "shay";
        int age3 = 21;
        char gender = 'f';

        boolean isEligible3 = age3>=18 && (gender == 'm' || gender =='f');

        System.out.println(name3 + " Is eligible: " + isEligible3);

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa>=2.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible5);







    }


}
