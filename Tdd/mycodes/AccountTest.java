package mycodes;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    private AccountEx freeBorn;
    @BeforeEach
    public void setUpBeforeEachTest(){
        freeBorn = new AccountEx();
    }


    @Test
   // @DisplayName("Test That Account Class Is not Null")
    public void test_ThatAccountClassIsNotNull(){
        //given that I have an Account
        //check that I can create an account
        //assert that account Exist
        assertNotNull(freeBorn);
    }

    @Test
    public void testThatWeCanDepositToAccount(){
        //given that I have an account
        //check that I can deposit Money
        //Assert that My Balance Increases
        freeBorn.depositAmount(5000);
        assertEquals(5000, freeBorn.getBalance());
    }

    @Test
    public void testThatWeCannotWithdrawMoreThanWhatWeHave(){
        //given that I have an account
        //check that I can make deposits to my account, but I cannot withdraw more than what I have.
        //Assert that My Balance decreases
        freeBorn.depositAmount(10000);
        freeBorn.withdrawAmount(12000);
        assertEquals(10000, freeBorn.getBalance());
    }
    @Test
    public void testThatWeCanWithdraw(){
        //given that I have an account
        //check that I can make deposits to my account, and make withdrawals
        //Assert that My Balance decreases
        freeBorn.depositAmount(4000);
        freeBorn.withdrawAmount(2000);
        assertEquals(2000, freeBorn.getBalance());
    }
    @Test
    public void testThatWecannotDepositNegativeAmout(){
        //given that i have an account
        //check that i can make deposit
        //assert that my account balance does not increase if i make negative deposit
        freeBorn.depositAmount(-2000);
        assertEquals(0.0, freeBorn.getBalance());
    }

}
