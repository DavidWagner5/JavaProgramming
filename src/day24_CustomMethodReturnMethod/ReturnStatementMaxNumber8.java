package day24_CustomMethodReturnMethod;

public class ReturnStatementMaxNumber8 {
    public static void main(String[] args) {
int numbers [] = {1,4,5,6,4,9,8,7,44};

int maxnum = maxNumberArray(numbers);
int minnum = minNumberArray(numbers);
        System.out.println(maxnum);
        System.out.println(minnum);
    }

    public static int maxNumberArray (int[] numbers){
        int max = 0;

        for (int each : numbers) {

            if(each>max){
                max = each;
            }

        }
        return max;
    }

    public static int minNumberArray (int [] numbers){

        int min = 10;

        for (int each : numbers) {

            if(each<min)
            min = each;
        }
        return min;
    }



}
