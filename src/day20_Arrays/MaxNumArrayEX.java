package day20_Arrays;

public class MaxNumArrayEX {
    public static void main(String[] args) {

        int[] numbers = {10 ,5, 4, 20, 1, 0};

        int max = numbers[0]; // assumption

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                max = numbers[i];
            }

        }
        System.out.println(max);





        int numbers2[] = {5,2,9,13,4};

        int max2 = numbers2[0];

        for (int i = 0; i < numbers2.length; i++) {

            if(numbers2[i] > max2) {

                max2 +=numbers2[i];
            }

        }
        System.out.println(max2);

    }




    }

