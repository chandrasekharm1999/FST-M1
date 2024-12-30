import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import activityPrograms.BankAccount;
import activityPrograms.NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;

class ExpectedExceptionTest {

    @Test
    void notEnoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(9);

        // Assertion for exception
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }

    private void assertThrows(Class<NotEnoughFundsException> expectedType, Executable executable, String message) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void enoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);
    
        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}