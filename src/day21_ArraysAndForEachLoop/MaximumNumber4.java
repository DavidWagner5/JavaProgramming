package day21_ArraysAndForEachLoop;

public class MaximumNumber4 {
    public static void main(String[] args) {

        int [] numbers = {10,5,4,20,1,0};
        int max = numbers[0];

        for (int each : numbers) {
            if(each>max){
                max = each;
            }
        }
        System.out.println(max);

    }
}
