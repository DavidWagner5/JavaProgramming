package day24_CustomMethodReturnMethod;

public class ReturnMethod2 {
    public static void main(String[] args) {
        //find max num 100 or 200
        //multiply the max number by 2

       int maxNumber = max(100, 200);

        System.out.println(maxNumber);

        int multiplication = maxNumber*2;

        System.out.println(multiplication);
    }

    public static int  max (int a, int b){

        int result = 0;

        if(a>b){
            result = a;
        }else{
            result = b;
        }
        return result;
        //                                           ^
        //now we store it so we can reuse it up top. |
    }

}
