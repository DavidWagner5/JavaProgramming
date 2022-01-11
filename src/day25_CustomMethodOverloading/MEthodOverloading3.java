package day25_CustomMethodOverloading;
//if the method name is the same, different parameters it is overloaded
import java.util.Arrays;

public class MEthodOverloading3 {
    public static void main(String[] args) {

        int [] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);

        double [] doubleArray = {10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);

        char [] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);
    }
}
