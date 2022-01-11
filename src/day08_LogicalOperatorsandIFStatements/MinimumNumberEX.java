package day08_LogicalOperatorsandIFStatements;

public class MinimumNumberEX {
    public static void main(String[] args) {

        int n1 = 100,
                n2 = 200;

        boolean n1isMin = n1 <n2;
        boolean n2isMin = n1>n2;
        boolean equal = n1 == n2;

        if(n1isMin){

            System.out.println("N1 is Minimum");
        }
        if(n2isMin){
            System.out.println("N2 is Minimum");
        }
        if(equal){
            System.out.println("Equal");
        }
    }
}
