package day20_Arrays;



public class MinNumberEX {
    public static void main(String[] args) {

        int[] numbers = {10 ,5, 4, 20, 1, 90};

        int min = numbers[0];// assumption is that 100 is the minimum number

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] < min){
                min = numbers[i];
            }

        }
        System.out.println(min);

    }
}




