import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        CurrentAccount ca = new CurrentAccount(10000, 500, "Huda");
        SavingsAccount sa = new SavingsAccount(10000, 200, "Connor");

        ca.withdraw(400);
        System.out.println(sa.getBalance());
        sa.addIntrestRate();
        System.out.println(sa.getBalance());

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();

        list.add(ca);
        list.add(sa);

        ba.toString(list);


    }

}
