import java.util.ArrayList;
import java.util.List;

class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public  List<Destination> getDestinations(){
        return destinations;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public void printItinerary() {
        System.out.println("Travel Package Name: " + name);
        System.out.println("Itinerary:");

        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity Name: " + activity.getName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " + activity.getCost());
                System.out.println("Capacity: " + (activity.getCapacity() - activity.getCurrentCapacity()) + " spaces available");
                System.out.println("-----------------------");
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package Name: " + name);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        System.out.println("Passenger List:");

        for (Passenger passenger : passengers) {
            System.out.println("Name: " + passenger.getName() + ", Number: " + passenger.getPassengerNumber());
        }
    }

    public void printDetailsOfIndividualPassenger(Passenger passenger) {
        System.out.println("Passenger Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        System.out.println("Balance: " + passenger.getBalance());

        List<Activity> signedUpActivities = passenger.getSignedUpActivities();
        if (!signedUpActivities.isEmpty()) {
            System.out.println("Activities signed up for:");
            for (Activity activity : signedUpActivities) {
                System.out.println("Destination: " + activity.getDestination().getName());
                System.out.println("Activity: " + activity.getName());
                System.out.println("Price Paid: " + activity.getCost());
            }
        } else {
            System.out.println("No activities signed up for.");
        }
        System.out.println("-----------------------");
    }

    public void printDetailsOfAvailableActivities() {
        System.out.println("Available Activities:");
        for (Destination destination : destinations) {
            for (Activity activity : destination.getActivities()) {
                if (!activity.isFull()) {
                    System.out.println("Destination: " + destination.getName());
                    System.out.println("Activity: " + activity.getName());
                    System.out.println("Spaces Available: " + (activity.getCapacity() - activity.getCurrentCapacity()));
                    System.out.println("-----------------------");
                }
            }
        }
    }
}
