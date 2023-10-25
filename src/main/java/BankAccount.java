import java.util.ArrayList;

public class BankAccount {

    public double balance;
    public double minBalance;

    public String accountHolderName;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public short setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return 0;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public BankAccount(){

    }

    public BankAccount(double balance, double minBalance, String accountHolderName) {
        this.balance = balance;
        this.minBalance = minBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("new balance: " + balance);
    }

    public void withdraw(int amount){
        balance -= amount;
        System.out.println("new balance: " + balance);
    }



    public void toString(ArrayList<BankAccount> list) {
        System.out.println("BankAccount{" +
                "balance=" + balance +
                ", minBalance=" + minBalance +
                ", accountHolderName='" + accountHolderName + '\'' +
                '}');
    }
}
