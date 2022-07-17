package InterviewPracticeTasks;

public class ArrayMaxandMin {
    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max=0;
        int min=10;


        for (int each : numbers) {

            if(each>max){
                max =each;
            }

            if(each<min){

                min=each;
            }

        }

        System.out.println(max);
        System.out.println(min);

    }
}
