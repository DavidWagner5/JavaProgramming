package ShortsPractice;

public class FunctionalInterface {

    public static void main(String[] args) {


        MyInterfaces <Integer> cube = (x) -> {
            System.out.println(x*x*x);
        };

        cube.function(10);


        MyInterfaces <Integer> oddOReven = (y) -> {
            if(y%2==0){
                System.out.println(y + " is an even number");
            }else{
                System.out.println(y + " is not even number");
            }
        };

        oddOReven.function(20);



        MyInterfaces<String> reverseThisString = (str) -> {
            for (int i = str.length()-1; i >=0  ; i--) {

                System.out.print(str.charAt(i));

            }
        };

        reverseThisString.function("Hello There");


    }
}
