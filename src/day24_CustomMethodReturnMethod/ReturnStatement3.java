package day24_CustomMethodReturnMethod;
//used for exiting the method
// also used for returning a value from return methods
public class ReturnStatement3 {

    public static void main(String[] args) {
nameOFDay(10);
    }


    public static void nameOFDay(int number) {

        if (number < 1 || number > 7) {
            System.out.println("invalid");
            return; //exits name of day method kind of like the exit method

        }

        System.out.println((number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)? "Thursday" :(number==5)? "Friday"
                :(number==6)? "Saturday" :"Sunday");
    }
}
