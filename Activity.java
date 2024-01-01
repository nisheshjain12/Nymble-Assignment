import java.util.ArrayList;
import java.util.List;

class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int currentCapacity;
    private Destination destination;
    private List<Passenger> passengers;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.currentCapacity = 0;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public boolean isFull() {
        return currentCapacity >= capacity;
    }

    public boolean signUp(Passenger passenger) {
        if (!isFull()) {
            passengers.add(passenger);
            currentCapacity++;
            return true;
        }
        return false;
    }

    // Getters for activity details

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public Destination getDestination() {
        return destination;
    }
}