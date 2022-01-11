package utilities;

public class MathUtility {

    //sum of two integers
    public static int sum(int num1,int num2){
    return num1+num2;


}   //sum of two decimal numbers
    public static double sum (double num1, double num2){
        return num1+num2;

}   //subtract two integers
    public static int subtract(int num1, int num2){
        return num1-num2;
}   //subtract two doubles
    public static double subtract(double num1, double num2){
        return num1-num2;

    }
    //multiply two ints
    public static int multiplication(int num1, int num2){
        return num1*num2;

    }
    //multiply two doubles
    public static double multiplication (double num1, double num2){
        return num1*num2;
    }
    //divide two decimals
    public static double division (double num1, double num2){
        return num1/num2;
    }
    //find even num
    public static boolean evenNumber (int number){
        boolean even = false;
        if(number%2==0){
            even =  true;
        }
        return even;
    }
    //find odd num
    public static boolean oddNumber(int number){
        boolean odd = false;
        if(number%2 != 0){
            odd = true;
        }
        return odd;
    }
    // find max num int
    public static int maximumNumber (int num1,int num2) {
        int result = num2;

        if (num1 > num2) {
            result = num1;
        }
        return result;
    }
    //find max num double
    public static double maximumNumber (double num1,double num2) {
        double result = num2;

        if (num1 > num2) {
            result =num1;
        }
        return result;
    }
    //find min num int
    public static int minimumNumber (int num1, int num2){
        int result = num2;
        if (num1<num2){
            result = num1;
        }
        return result;
    }
    //find min num double
    public static double minimumNumber (double num1, double num2){
        double result = num2;
        if (num1<num2){
            result = num1;
        }
        return result;
    }
    //find square of int
    public static int square (int number){
        return number*number;
    }
    //find square of double
    public static double square (double number){
        return number*number;
    }
    //find cube of int
    public static int cubicSquare (int number){
        return square(number)*number;
    }
    //find cube of double
    public static double cubicSquare (double number){
        return square(number)*number;
    }







}
