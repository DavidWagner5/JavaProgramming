package day53_FunctionalInterface_Stream;
//PREDICATE returns boolean, CONSUMER does not return anything, FUNCTION it takes two arguments
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionaInterfaces1 {

    public static void main(String[] args) {

        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };


        boolean result1 = isPalindrome.test("java");
        System.out.println(result1);



        //----------------------------------

        Predicate<Integer> isEven = p -> p%2==0;

        boolean result2 = isEven.test(5);
        System.out.println(result2);




        //-----------------------------------

        Consumer<String> printEach = (s) -> {

            for (int i = 0; i < s.length() ; i++) {

                System.out.println(s.charAt(i));

            }
        };

        printEach.accept("Wooden Spoon");


        //------------------------------------------

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,34,5,6,7,8,9));

        list2.forEach(p -> System.out.println(p));

        //-------------------------------------------

        List<String> employees = new ArrayList<>(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah", "Jilili Jiwuer", "Ali Ismayilov"));

       employees.forEach(s -> {
           System.out.println(s.charAt(0)+ "." + s.charAt(s.lastIndexOf(" ")+1));
       } );


       //-------------------------------------------


        Function<int[], List<Integer>> convertToList = (a) -> {List<Integer> result = new ArrayList<>();

            for (int each : a) {
                result.add(each);

            }

            return result;

        };


        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> l = convertToList.apply(arr);
        System.out.println(l);


        //---------------------------------------------



        Function<List<Integer>, int[]> convertToArray = (o) -> {
            int[] result = new int[o.size()];

            for (int i = 0; i < o.size(); i++) {
                result[i] = o.get(i);

            }

            return result;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        convertToArray.apply(numbers);












    }
}
