package day21_ArraysAndForEachLoop;

public class TaskInitials11 {
    public static void main(String[] args) {

        String names [] = {"David Wagner" , "Raluca Ilut" , "Steve loev"};


        for (String each : names) {
            String initials = each.charAt(0)+"."+ each.charAt(each.indexOf(" ")+1);


            System.out.println(initials);
        }


    }
}
