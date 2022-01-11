package day08_LogicalOperatorsandIFStatements;

public class GradeLevelEX {

    public static void main(String[] args) {

        byte level = 15; // 1 ~ 18

        boolean n1 = level >= 1 && level <= 5;
        boolean n2 = level >= 6 && level <= 8;
        boolean n3 = level >= 9 && level <= 12;
        boolean n4 = level >= 13 && level <= 16;
        boolean n5 = level >= 17 && level <= 18;

        if (n1) {
            System.out.println("Elementary school");}

        if (n2) {
            System.out.println("Middle school"); }

        if (n3) {
            System.out.println("High school"); }

        if (n4) {
            System.out.println("College"); }

        if (n5)
            System.out.println("Grad School");

    }

}

/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */


