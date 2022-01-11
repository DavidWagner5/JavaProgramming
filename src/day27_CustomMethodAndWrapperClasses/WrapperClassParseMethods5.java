package day27_CustomMethodAndWrapperClasses;

public class WrapperClassParseMethods5 {
    public static void main(String[] args) {

        //parse methods for converting string to a primitive type
        String str = "123";
        int num = Integer.parseInt(str); //int

        System.out.println(num + 1); //124
        System.out.println(str + 1);//1231


        //-----------------

        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 1);//11.5
        System.out.println(str2 + 1);//10.51

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        //------------------

        System.out.println(max); // 2147483647
        System.out.println(min); //-2147483648

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.println(max2); //9223372036854775807
        System.out.println(min);

        //------------------

        String s1 = "True";
        boolean r1 = Boolean.parseBoolean(s1); //true

        //--------valueOF

        String s2 = "123";
        Integer x = Integer.valueOf(s2); //returns you Integer
        int y = Integer.valueOf(s2); //unboxing

        //--------------

        String s3 = "1.5";
        Double.valueOf(s3);
        double z = Double.valueOf(s3); //Double
        System.out.println(z);
//------------------------------------

        String s = "125";
        int a = Integer.parseInt(s);
        Integer b = Integer.valueOf(s);   // so this two a and b will return 125 but a is primitive b is object.They are not same . How can we check  equality?


        //----------------------
        //isDigit //is letter, is letterordigit, isuppercase, islowecase
        char ch1 = '0';
        boolean r5 = Character.isDigit(ch1);
        System.out.println(r5); //true

        char ch2 = 'A';
        boolean r6 = Character.isLetter(ch2); //true

        char ch3 = '!';
        boolean r7 = !Character.isLetterOrDigit(ch3); //true
        System.out.println(r7);


        boolean r8 = Character.isUpperCase(ch2); //true

        boolean r9 = Character.isLowerCase(ch2); //false


        //------------------------------------

    }
}
