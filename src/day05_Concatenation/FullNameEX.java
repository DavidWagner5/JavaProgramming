package day05_Concatenation;

public class FullNameEX {

    public static void main(String[] args) {

        String FirstName = "David";
        String LastName = "Wagner";
        int age = 55;
        String JobTitle = "SDET";
        String FullName = FirstName + " " + LastName;
        String CompanyName = "Apple Inc.";
        double salary = 100000.58;

        System.out.println("Full name of the person is " + FullName);

        System.out.println(FullName + " is " + age + " years old. ");

        System.out.println(FullName + " is " + JobTitle + ", and works at " + CompanyName + " and " + FullName + " salary is " + salary + ".");

    }
}
