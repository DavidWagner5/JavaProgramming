package day20_Arrays;

public class appearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B','C'};




        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j];
            int freq = 0;


            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    freq++;
                }

            }

            if(freq==1){
                System.out.println(ch);
            }

        }
    }
}
