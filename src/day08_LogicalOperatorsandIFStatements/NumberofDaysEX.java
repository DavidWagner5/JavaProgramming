package day08_LogicalOperatorsandIFStatements;

public class NumberofDaysEX {

    public static void main(String[] args) {
        int Monthnumber = 4;

        boolean has28Days = Monthnumber ==2;
        boolean has30Days =Monthnumber == 4 || Monthnumber== 6 || Monthnumber == 9 || Monthnumber == 11;
        boolean has31Days = !has28Days && !has30Days;

        if(has28Days){
            System.out.println("Has 28 Days");
        }
        if(has30Days){
            System.out.println("Has 30 Days");
        }
        if(has31Days){
            System.out.println("Has 31 Days");
        }


    }
}
