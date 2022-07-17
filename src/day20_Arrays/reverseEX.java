package day20_Arrays;

public class reverseEX {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        String reverse = "";

        for (int i = num.length - 1; i >= 0; i--) {
            reverse += num[i];


        }
        System.out.println(reverse);


        int[] num2 = {1, 2, 3, 4, 5};
        String reverse2 = "";

        for (int i = num2.length - 1; i >= 0; i--) {

            reverse2 +=num2[i];

        }
    }
}


