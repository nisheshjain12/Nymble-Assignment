import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActivityTest {

    @Test
    public void testIsFullWhenNotFull() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Tour", "Visit Eiffel Tower", 50, 2, destination);

        boolean isFull = activity.isFull();

        assertFalse(isFull);
    }

    @Test
    public void testIsFullWhenFull() {
        Destination destination = new Destination("Paris");
        Activity activity = new Activity("Eiffel Tower Tour", "Visit Eiffel Tower", 50, 2, destination);
        Passenger passenger1 = new Passenger("Alice", 1, "standard", 100);
        Passenger passenger2 = new Passenger("Bob", 2, "standard", 100);

        activity.signUp(passenger1);
        activity.signUp(passenger2);

        boolean isFull = activity.isFull();

        assertTrue(isFull);
    }

}
