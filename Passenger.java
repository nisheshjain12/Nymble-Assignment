import java.util.ArrayList;
import java.util.List;

class Passenger {
    private String name;
    private int passengerNumber;
    private String passengerType;
    private double balance;
    private List<Activity> signedUpActivities;

    public Passenger(String name, int passengerNumber, String passengerType, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.signedUpActivities = new ArrayList<>();
    }

    public boolean deductBalance(double amount) {
        if (passengerType.equals("standard")) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
        } else if (passengerType.equals("gold")) {
            double discountedAmount = amount * 0.9; // Apply 10% discount for gold passengers
            if (balance >= discountedAmount) {
                balance -= discountedAmount;
                return true;
            }
        } else if (passengerType.equals("premium")) {
            // Premium passengers don't have to pay
            return true;
        }
        return false;
    }

    public void signUpForActivity(Activity activity) {
        signedUpActivities.add(activity);
    }

    // Getters for passenger details

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public double getBalance() {
        return balance;
    }

    public List<Activity> getSignedUpActivities() {
        return signedUpActivities;
    }
}