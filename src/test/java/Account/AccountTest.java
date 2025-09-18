package Account;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    Account account;

    @Before
    public void initAccount() {
        account = new Account();
    }

    @Test
    public void testDeposit() {
        account.deposit(5.0);
        assertEquals(5.0, account.getBalance(), 0.0000001);
    }

    @Test
    public void testWithdraw() {
        account.deposit(5.0);
        assertEquals(3.0, account.withdraw(2.0), 0.0000001);
        assertEquals(3.0, account.getBalance(), 0.0000001);
        assertEquals(0.0, account.withdraw(4.0), 0.0000001);
        assertEquals(3.0, account.getBalance(), 0.0000001);
    }

    @Test
    public void testCheck() {
        assertEquals(0.0, account.getBalance(), 0.0000001);
        account.deposit(7.0);
        assertEquals(7.0, account.getBalance(), 0.0000001);
    }
}
