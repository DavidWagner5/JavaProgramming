package day18_NestedLoop;
/* divide two numbers without using / operator */
public class DivisionTaskWhileLoopEX {
    public static void main(String[] args) {


        int a =30;  //30-7 30-7 30-7 30-7
        int b = 7;

        int count = 0;


        while(a>=b){
            a-=b;
            count++;

        }
        System.out.println(count + "with a remainder of"+a);
    }
}
