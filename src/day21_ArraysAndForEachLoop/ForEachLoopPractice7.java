package day21_ArraysAndForEachLoop;

public class ForEachLoopPractice7 {
    public static void main(String[] args) {

        String words [] = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early birds", "Angry Birds"};

        String initials = "";

        for (String each : words) {
            initials = (each.charAt(0)+ " " + each.charAt(each.indexOf(" ")+1)); // use "" so that it can conver to string of text insdead of adding

            System.out.println(initials);
        }


    }
}
