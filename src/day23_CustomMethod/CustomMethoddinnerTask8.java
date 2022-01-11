package day23_CustomMethod;
/*create a method that can if the given integer is positive, negative or zero */
public class CustomMethoddinnerTask8 {

    public static void main(String[] args) {

        PositiveOrNegative(0);
    }

    public static void PositiveOrNegative(int number){

        if(number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
