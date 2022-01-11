package day35_OOPEncapsulation;
/*3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments */
public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount can not be zero or negative");
            return; // exits the method
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("insufficient balance");
        }
        if (amount < 0) {
            System.out.println("Deposit amount can not be zero or negative");
            return; // exits the method
        }
        balance -= amount;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';


    }
}
