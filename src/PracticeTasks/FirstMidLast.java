package PracticeTasks;
//first middle and last letter of a word
public class FirstMidLast {



        public static String firstMidLast(String word) {


            if (word.length() <= 2) {
                throw new RuntimeException("String too short");

            } else if (word.length() % 2 == 0) {

                word = "" + word.charAt(0) + word.charAt(word.length() - 1);
            } else {
                word = "" + word.charAt(0) + word.charAt(word.length() / 2) + word.charAt(word.length() - 1);
            }


            return word;
        }

}
