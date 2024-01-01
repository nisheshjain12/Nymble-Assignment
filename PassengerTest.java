import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {

    @Test
    public void testDeductBalanceForStandardPassenger() {
        Passenger passenger = new Passenger("Alice", 1, "standard", 100);
        boolean isDeducted = passenger.deductBalance(50);

        assertTrue(isDeducted);
        assertEquals(50, passenger.getBalance());
    }

    @Test
    public void testDeductBalanceForGoldPassenger() {
        // Create a gold passenger with initial balance of 200
        Passenger goldPassenger = new Passenger("John", 1, "gold", 200);

        // Deduct 10% from the balance (expected deduction: 20)
        goldPassenger.deductBalance(100); // Assuming 100 is the deduction amount
        double expectedBalance = 180; // Expected balance after 10% deduction

        assertEquals(expectedBalance, goldPassenger.getBalance(), 0.01);
        // Use a delta value to accommodate for floating-point precision issues
    }

}
