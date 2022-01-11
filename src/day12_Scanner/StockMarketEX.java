package day12_Scanner;
import java.util.Scanner;
public class StockMarketEX {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many total shares you have ");
        int shares= scan.nextInt();

        if (shares<=0){
            scan.close();
        }
        System.out.println("How much is your total value in the stock market");
        double totalValue= scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the name of the company");
        String name= scan.nextLine();

        System.out.println("Your total stock market holding is $"+totalValue+
                " which is made up of "+shares+". "+name+" is your company holdings.");
        scan.close();

    }
}

