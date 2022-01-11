package PracticeTasks;
//Wrtie the program enter a string and a char, returns the frequency of the char from the string
public class FrequencyofChar {
    public static void main(String[] args) {

        String str = "aaabbbbbccccc";
        char ch = 'c';
        int freq = 0;

        for (int i = 0; i < str.length(); i++) {
           char eachchar = str.charAt(i);

           if(eachchar==ch){
               freq++;
           }

        }
        System.out.println(freq);

    }
}
