package day20_Arrays;

public class reverseEX {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        String reverse = "";

        for (int i = num.length - 1; i >= 0; i--) {
            reverse += num[i];


        }
        System.out.println(reverse);
    }
}


