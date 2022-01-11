package day21_ArraysAndForEachLoop;
//you can only use foreachloops for data structure. Array. collection, or map
//it only gets you the first to last element, fixed iteration, not as powerful as the other loops
public class ForEachLoop3 {
    public static void main(String[] args) {

        int numbers[] = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }


        System.out.println("---------------------");

        for (int each:numbers){
            System.out.println(each);
        }
    }
}
