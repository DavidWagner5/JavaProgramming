package day21_ArraysAndForEachLoop;

public class uniqueElements8 {
    public static void main(String[] args) {

        String words [] = {"Layan", "Oleksandr", "Layan", "Adam", "Adam"};


        for (String each : words) {


            int count = 0;
            for (String element : words) {
                if (element.equals(each)) {
                    count++;
                }

            }
            if(count ==1){
                System.out.println(each);
            }
        }
    }
}
