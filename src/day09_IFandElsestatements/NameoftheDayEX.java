package day09_IFandElsestatements;

public class NameoftheDayEX {

    public static void main(String[] args) {
        int n = 5;//1~7
        String day;

        if(n==1){
            //System.out.println("Monday"); you can do it this way too, if you don't want to print sout. just make a string variable + assignment operator
            day = "Monday";
        }else if(n==2){
            //System.out.println("Tuesday");
            day = "Tueday";
        }else if(n==3){
            System.out.println("Wednesday");
        }else if(n==4){
            System.out.println("Thursday");
        }else if(n==5){
            System.out.println("Friday");
        }else if(n==6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");

        }

    }
}
