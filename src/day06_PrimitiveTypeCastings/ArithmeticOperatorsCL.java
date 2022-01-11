package day06_PrimitiveTypeCastings;
/*

+ Addition
- Subtraction
* Multi
/ Division
% Remainder

integer in numerator will give your integer as answer
double in numerator will give you decimal as answer
 */
public class ArithmeticOperatorsCL {

    public static void main(String[] args) {

        System.out.println(10 * 5);
        System.out.println(100/3);
        System.out.println(10.0/3);
        //or for decimals
        System.out.println(10d/3);

        int a = 100;
        double b =a/6;
        double c =a/6.0;

        System.out.println(b);
        System.out.println(c);

        System.out.println(100d);
    }
}
