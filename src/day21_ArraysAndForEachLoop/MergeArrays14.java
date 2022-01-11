package day21_ArraysAndForEachLoop;

import java.util.Arrays;

public class MergeArrays14 {
    public static void main(String[] args) {

        String [] group1 = {"Ali", "Layan", "Aysenur"}; //3
        String [] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};//5
        String students [] = new String[group1.length + group2.length]; //8

        int i=0;

        for (String each : group1) {
            students[i++] = each;

        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));


        //----------------------------

         int o = 0;
        char ch1 [] = {'A','B','C'};
        char ch2[] = {'D','E'};

        char both [] = new char[ch1.length+ch2.length];

        for (char each : ch1) {
            both[o++]=each;


        }
        for (char each : ch2) {
            both[o++]=each;
        }
        System.out.println(Arrays.toString(both));
    }
}
