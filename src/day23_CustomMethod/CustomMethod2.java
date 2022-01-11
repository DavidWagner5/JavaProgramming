package day23_CustomMethod;

public class CustomMethod2 {
    public static void main(String[] args) {

        function1();
        function2();
        function3();


    }


    public static void function1(){

        for (int i = 0; i <= 4 ; i++) {
            System.out.println("Hello world");

        }
    }

    public static void function2(){
        for (int i = 0; i <=4 ; i++) {
            System.out.println("Hello Cydeo");

        }
    }

    public static void function3(){  //even numbers
        for (int i = 2; i <=10 ; i++) {
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }




}
