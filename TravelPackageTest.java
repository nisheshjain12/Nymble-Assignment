import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TravelPackageTest {

    @Test
    public void testGetDestinations() {
        // Create a TravelPackage instance
        TravelPackage travelPackage = new TravelPackage("Europe Trip", 50);

        // Add some destinations to the travel package
        Destination destination1 = new Destination("Paris");
        Destination destination2 = new Destination("Rome");
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Retrieve the list of destinations using getDestinations()
        List<Destination> destinations = travelPackage.getDestinations();

        // Perform assertions to verify the retrieved destinations
        assertNotNull(destinations);
        assertEquals(2, destinations.size());
        assertTrue(destinations.contains(destination1));
        assertTrue(destinations.contains(destination2));
    }
}