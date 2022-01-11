package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumEX {
    public static void main(String[] args) {

       /* int[] numbers = {10, 20, 30, 40, 50, 60};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        double averageNumber = sum/numbers.length;

        System.out.println("averageNumber = " + averageNumber);
    }

} */


    Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
                int length = scan.nextInt();
                int[] nums = new int[length];
                int sum = 0;

                for (int i = 0; i < length; i++) {
        System.out.println("enter number");
        nums[i] = scan.nextInt();
        sum += nums[i];

        }

        if (length <= 0) {
        System.err.println("Invalid entry");
        System.exit(0);
        }

        double averageNum = sum/nums.length;
        System.out.println("averageNum = " + averageNum);

        System.out.println(Arrays.toString(nums));
        }
        }
