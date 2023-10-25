public class CurrentAccount extends BankAccount{

    public double maxWithdrawlAmmount = 300;
    public CurrentAccount(double balance, double minBalance, String accountHolderName){
        super(balance, minBalance, accountHolderName);
    }

    @Override
    public void withdraw(int amount){
        if(amount > maxWithdrawlAmmount){
            System.out.println("You have exceeded your max withdrawal limit");
        } else {
            balance -= amount;
            System.out.println("new balance: " + balance);
        }

    }

}
