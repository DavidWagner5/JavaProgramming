package day08_LogicalOperatorsandIFStatements;

public class MedianNumberEX {
//challenging
    public static void main(String[] args) {

        int a = 10,
                b = 30,
                c = 25;

        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian = (b>a && b<c) || (b>c && b<a);
        boolean cISMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) {
            System.out.println("A is Median");
        }

        if(bIsMedian){
            System.out.println("B is Median");
        }

        if(cISMedian){
            System.out.println("C is Median");
        }

    }
}
