import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

 class AccountTest {
    Account account;

    @BeforeEach
    public void setup() {
        account = new Account("emmanuel", 12345678, "1111");
    }

    @Test
    public void test_that_if_i_deposit_negative_amount_account_throw_error(){
        assertThrows(Exception.class,()->account.deposit(-3000));

    }

    @Test
    public void test_that_i_can_deposit_money_into_account() {
        account.deposit(1000);
        account.deposit(3000);
        assertEquals(4000, account.getBalance());
    }
    @Test
    public  void test_that_i_can_withdraw_negative_amount_throw_error(){
        assertThrows(Exception.class, ()->account.withdraw(-3700));

    }
    @Test
    public  void test_that_i_can_withdraw_amount_that_pass_money_in_the_account_throw_error(){
        assertThrows(Exception.class, ()->account.withdraw(4200));
    }
    @Test
    public  void  test_that_i_can_withdraw_money(){
        account.deposit(4000);
        account.withdraw(1000);
        assertEquals(3000, account.getBalance());
    }
}
