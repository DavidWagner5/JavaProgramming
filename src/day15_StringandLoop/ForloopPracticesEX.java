package day15_StringandLoop;

public class ForloopPracticesEX {

    public static void main(String[] args) {

        for (int number = 15; number <= 50; number++) {
            System.out.print(" " + number);

        }

        System.out.println();


        for (int num = 100; num >= 1; num--) {

            System.out.print(" " + num);
        }

        System.out.println();

        for(int num1 = 1; num1 <=55; num1++){//or you can just assign num1++ to +=2 instead of using an if statement
            if(num1 % 2==0){
                System.out.print(num1+ " ");



            }
        }


    }
}
