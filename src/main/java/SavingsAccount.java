public class SavingsAccount extends BankAccount{

    public double intrestRate = 0.05;
    public SavingsAccount(double balance, double minBalance, String accountHolderName){
        super(balance, minBalance, accountHolderName);
    }

    public void addIntrestRate(){
        double value = balance * intrestRate;
        balance += value;
    }

}
