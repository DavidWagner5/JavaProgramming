package day19_LoopPractices;

public class UniqueCharsForLoopEX {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; // bdf

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //this outer loop picks characters to be inputted in inner loop.
            int freq = 0;//represents the frequency of the variable ch

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i); //each character of the string
                if (ch == each) {
                    freq++;
                }


            }
            if(freq>1){
                continue;// if the frequency is equal to 1, then it will rpint the unique char, or you can do if(freq>1) continue;

            }
            result+=ch;

        }
        System.out.println(result);
    }
}
