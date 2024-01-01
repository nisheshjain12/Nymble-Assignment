import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class DestinationTest {

    @Test
    public void testAddActivityToDestination() {
        Destination destination = new Destination("Paris");
        Activity activity1 = new Activity("Eiffel Tower Tour", "Visit Eiffel Tower", 50, 20, destination);
        Activity activity2 = new Activity("Louvre Museum", "Visit Louvre Museum", 40, 30, destination);

        destination.addActivity(activity1);
        destination.addActivity(activity2);

        List<Activity> activities = destination.getActivities();

        assertEquals(2, activities.size());
        assertTrue(activities.contains(activity1));
        assertTrue(activities.contains(activity2));
    }

    }
