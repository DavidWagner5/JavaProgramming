package day25_CustomMethodOverloading;
//for method overloading, the parameters must be different and have the same name. the method has to have similar functionality.
public class SumOfNumbers1 {
    public static void main(String[] args) {

       int sum =  sumofNumbers(10, 20);
        System.out.println(sum);

       int sum2 =  sumofNumbers(10,20,30);
        System.out.println(sum2);

        int sum3 = sumofNumbers(10,20,30,40);

        double sum4 = sumofNumbers(55.4,6.2);

        System.out.println(sum3);
        System.out.println(sum4);


    }

    public static int sumofNumbers (int num1, int num2){

        return num1 + num2;
    }  //changed all the names to just sumofNumbers
    public static int sumofNumbers ( int num1, int num2, int num3){

        return num1+num2+num3;
    }
    public static int sumofNumbers(int num1, int num2, int num3, int num4){

        return num1+num2+num3+num4;
    }
    public static double sumofNumbers(double num1, double num2){

        return num1+num2;
    }
    public static int sumofNumbers(int num1,int num2, int num3, int num4, int num5){

        return num1+num2+num3+num4+num5;
    }

}
