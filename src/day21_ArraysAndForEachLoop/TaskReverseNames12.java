package day21_ArraysAndForEachLoop;

public class TaskReverseNames12 {
    public static void main(String[] args) {

        String names [] = {"David Wagner" , "Raluca Ilut" , "Steve loev"};

        for (String each : names) {


            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed += each.charAt(i);

            }

            System.out.println(reversed);
        }
    }
}
