package day22_MultiDimensionalArray;

public class MinMaxNumber8 {
    public static void main(String[] args) {

        int max=0;
        int min=12;
        int [][]numbers={{2,5,17},{65,12,4}};

        for (int oneD[]:numbers) {
            for (int element:oneD) {
                if(element>max){
                    max=element;
                }
                if(element<min){
                    min=element;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
