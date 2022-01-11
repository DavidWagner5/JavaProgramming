package day26_CustomMethodsPuttinginUtilities;

public class RemoveElements {
    public static void main(String[] args) {


    }

    //removes the index from the int array and returns new int array
    public static int[] removeElements(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];


        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }

        return result;


    }


}
