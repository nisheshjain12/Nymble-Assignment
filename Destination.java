import java.util.ArrayList;
import java.util.List;

class Destination {
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    // Getters for destination details

    public String getName() {
        return name;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}