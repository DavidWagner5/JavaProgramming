package day07_Operators;
//double>float>long>int>short>byte
public class CastingsCL {

    public static void main(String[] args) {

        float averageScore = 20.5f;

        long num3 = (long)averageScore;

        byte num1 = (byte)averageScore;
        short num2 = (short)averageScore;

        System.out.println("num3 = " + num3);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);



    }
}
