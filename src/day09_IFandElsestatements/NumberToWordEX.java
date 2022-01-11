package day09_IFandElsestatements;

public class NumberToWordEX {
    public static void main(String[] args) {

        int number = 5;
        String word = "one";

        if(number == 1){
            System.out.println("one");
        }else if(number==2){
            System.out.println("two");
        }else if(number ==3){
            System.out.println("three");
        }else if(number==4){
            word = "four";
        }else if (number ==5){
            word = "five";
        }
        System.out.println("word = " + word);


        }
    }

