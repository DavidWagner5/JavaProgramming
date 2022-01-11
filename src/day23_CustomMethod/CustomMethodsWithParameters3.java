package day23_CustomMethod;

public class CustomMethodsWithParameters3 {
    public static void main(String[] args) {

        OddorEven(9);
        ageOfPerson(1997);
        printNumbers(1000,2000);


    }


    public static void OddorEven (int number){

        if (number % 2 == 0) {
            System.out.println(number+" is an even number");
        }else{
            System.out.println(number+ " is an odd number");
        }


    }

    public static void ageOfPerson (int birthYear){

        int age = 2021 - birthYear;
        System.out.println("Your age is: " +age);
    }

    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.print(i + " ");
        }
    }

    }

