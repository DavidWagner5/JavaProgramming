package day17_WhileandDoWhileLoop;

public class AllLoopPracticeEX {
    public static void main(String[] args) {
//when you know how many repetitions, use fori
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);



        }
        System.out.println("-----------------------");
        int j = 1;
        while(j<=10){
            System.out.println(j);
            j++;
        }

        System.out.println("------------------------");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while(k<=10);
    }
}
