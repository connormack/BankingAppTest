import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankingTest {
    BankAccount ba = new BankAccount();


    @Test
    public void testBankSetter(){
        ba.setBalance(1000);
        assertEquals(1000, ba.getBalance());
    }

    @Test
    public void testNameGetter(){
        ba.setAccountHolderName("Huda");
        assertEquals("Huda", ba.getAccountHolderName());
    }
}
