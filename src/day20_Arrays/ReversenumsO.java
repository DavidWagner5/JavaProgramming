package day20_Arrays;
/* create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c */
public class ReversenumsO {
    public static void main(String[] args) {

       int [] arr = new int [] {1,2,3,4,5};
        System.out.println("original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("Array in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);

        }



    }
}
