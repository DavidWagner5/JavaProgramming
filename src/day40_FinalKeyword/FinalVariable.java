package day40_FinalKeyword;

public class FinalVariable {


    final String birthDay;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        final String name;

        name = "Java";

       // name = "WoodenSpoon"; will not work


        System.out.println(name);

        FinalVariable obj = new FinalVariable("Jul/24");

    }


}
