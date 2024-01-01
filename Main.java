public class Main {
    public static void main(String[] args) {
        // Create Destinations
        Destination destination1 = new Destination("Paris");
        Destination destination2 = new Destination("Tokyo");

        // Add Activities to Destinations
        Activity activity1 = new Activity("Eiffel Tower Tour", "Visit Eiffel Tower", 50, 20, destination1);
        Activity activity2 = new Activity("Louvre Museum", "Visit Louvre Museum", 40, 30, destination1);
        Activity activity3 = new Activity("Sushi Making Class", "Learn to make sushi", 60, 15, destination2);
        Activity activity4 = new Activity("Tokyo Tower Observation", "View Tokyo from the tower", 45, 25, destination2);

        destination1.addActivity(activity1);
        destination1.addActivity(activity2);
        destination2.addActivity(activity3);
        destination2.addActivity(activity4);

        // Create a Travel Package
        TravelPackage travelPackage = new TravelPackage("European Adventure", 50);
        travelPackage.addDestination(destination1);
        travelPackage.addDestination(destination2);

        // Create Passengers
        
        Passenger passenger1 = new Passenger("Alice", 1, "standard", 100);
        Passenger passenger2 = new Passenger("Bob", 2, "gold", 200);
        Passenger passenger3 = new Passenger("Charlie", 3, "premium", 0);

        // Add Passengers to the Travel Package
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Passenger Signup for Activities
        activity1.signUp(passenger1);
        activity2.signUp(passenger2);
        activity3.signUp(passenger3);

        // Print Itinerary of the Travel Package
        travelPackage.printItinerary();

        // Print Passenger List of the Travel Package
        travelPackage.printPassengerList();

        // Print Details of an Individual Passenger
        travelPackage.printDetailsOfIndividualPassenger(passenger1);

        // Print Details of Available Activities
        travelPackage.printDetailsOfAvailableActivities();
    }
}