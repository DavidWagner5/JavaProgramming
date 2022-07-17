package day21_ArraysAndForEachLoop;

public class MinimumNumber5 {
    public static void main(String[] args) {

        int [] numbers = {10,5,4,20,1,0};
        int min = numbers[5];

        for (int each : numbers) {

            if(each<min){
                min = each;
            }

        }
        System.out.println(min);

    }



}
