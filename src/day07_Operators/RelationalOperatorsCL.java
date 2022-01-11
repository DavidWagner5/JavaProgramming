package day07_Operators;

public class RelationalOperatorsCL {

    public static void main(String[] args) {
        //>,>=,<,<=

        boolean result1 = 200>10;
        System.out.println("result1 = " + result1);

        boolean result2 = 300>=150; //if one of those statements is true, then it will be true. 300 is greater than 150
        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100;
        System.out.println("result3 = " + result3); //true
        
        boolean result4 = 300<100;
        System.out.println("result4 = " + result4); //false
        
        boolean result5 = 500<=700;
        System.out.println("result5 = " + result5);

        int score = 59;
        boolean hasFailed = score <=59;

        boolean result8 = 500==400;
        System.out.println("result8 = " + result8);

        boolean result9 = "David" == "Good";
        System.out.println("result9 = " + result9);
        
        boolean result10 = "David" != "David"; //!= means not equal to
        System.out.println("result10 = " + result10);




    }
}
