package day31_Constructors;

public class BankAccountObjects {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok", 123456789);

       account1.deposit(1000);
        System.out.println(account1);

        account1.withdraw(900);
        System.out.println(account1);
        account1.checkBalance();

        account1.deposit(900);
       account1.checkBalance();


       BankAccount account2 = new BankAccount();
       account2.setInfo("David", 55555555);


    }
}
