package PracticeTasks;

public class HighestFrequency {
    public static void main(String[] args) {

        String str = "aaaaaaaaaaabbbbbss";

        int highestfreq = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                    count++;
                }

            }
            if (count>highestfreq){
                highestfreq=count;
            }
        }
        System.out.println("highestfreq = " + highestfreq);
    }
}
