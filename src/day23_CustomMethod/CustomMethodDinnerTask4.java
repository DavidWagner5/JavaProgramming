package day23_CustomMethod;
/*1. create a method that can print odd numbers between 1~100 in a same line saperated by space */
public class CustomMethodDinnerTask4 {
    public static void main(String[] args) {

oddNumber();

    }

    public static void oddNumber (){

        for (int i = 1; i <=100 ; i++) {
            if(!(i%2==0)){
                System.out.print(i+ " ");
            }
            }

        }
    }

