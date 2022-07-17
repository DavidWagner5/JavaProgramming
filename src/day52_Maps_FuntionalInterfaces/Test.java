package day52_Maps_FuntionalInterfaces;

public class Test {

    // lamba syntax: () -> {};

    public static void main(String[] args) {

        //function1 : create the function that can display if the number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }

        }; oddOrEvenNumber.apply(20);




            //function2: create a function that can check if the person is eligible to buy alcohol

        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol = (n) -> {
            if (n>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not Eligible to buy alcohol");
            }
        };
        eligibleToBuyAlcohol.apply(24);

            //function3 : create the function that can display the cube of a number

        MyFirstFunctionalInterface printCube;

        printCube = (n) -> {System.out.println(n*n*n);
        };

        printCube.apply(3);


        //function4: create a function that can check if a number is divisible by 3 and 5

        MyFirstFunctionalInterface divisibleBy3and5;

        divisibleBy3and5 = (n) -> {
            if (n%3==0 && n%5==0){
                System.out.println("Number is divisible by 3 and 5");
            }else{
                System.out.println("Number is not divisible by both 3 and 5");
            }
        };

        divisibleBy3and5.apply(15);

    }
}

