package day16_LoopandString;

public class UniqueCharactersEX {

    public static void main(String[] args) {

        String word = "AAAAAAAABCCCCCCCCCCd";
        String result = "";


        for (int i = 0; i < word.length() ; i++) { //i: is the index numbers of the word starting from 0
            char ch = word.charAt(i);//each character of the word
            if(word.indexOf(ch) == word.lastIndexOf(ch)){

                result +=ch;

            }





        }


        System.out.println(result);

        //if(word.indexOf('a') == word.lastIndexOf('a')){  if the first and last index number of the same character are the same, then it's unique, here it is not unique


        }




    }

