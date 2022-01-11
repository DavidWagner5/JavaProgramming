package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3EXIMP {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int length = scan.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("enter number");
            nums[i] = scan.nextInt();

        }

        if (length <= 0) {
            System.err.println("Invalid entry");
            System.exit(0);
        }

        System.out.println(Arrays.toString(nums));
    }
}
