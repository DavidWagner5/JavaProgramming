package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age: 38 years old

        byte age = 38; //only up to 127

        //weight: 160 pounds

        short weight = 160; //160 is in the range of short

        int salary = 100_000; //this is within the range of int

        long asset = 3_333_333_333L; //add L at the end fo long. This number, the program thinks it's in int range, but you can bypass by added an "L" to make "long"

        float tax = 0.26F; //for floats, you need to add F at the end in order to make it float


        double PI = 3.14;

        char ch3 = 45000; //when I run this code, I will get the 45,000th char character in the table. there are over 65,000 chars in ascii table
        System.out.println("ch3 = " + ch3);

        char gender = 'f';

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100 < 200;
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String Country = "USA";




    }
}
