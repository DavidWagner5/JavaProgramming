package day17_WhileandDoWhileLoop;

public class FrequencyofWordWhileLoopEX {
    public static void main(String[] args) {


        String sentence = "cat cat dog dog";
        sentence = sentence.toLowerCase();

        int countCat = 0;

        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat" , "");

            countCat++;
        }
        System.out.println(countCat);


        }




    }

