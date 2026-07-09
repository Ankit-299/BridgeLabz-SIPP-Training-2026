//  Drone Delivery System 
// Scenario
// A logistics company uses drones for package delivery.
// Requirements
// Create a class Drone.
// Variables
// Instance:
// droneId
// batteryPercentage
// Static:
// companyName
// Constructor
// Use this keyword to initialize instance variables.
// Methods


public class DroneSystem {
    public static void main(String[] args) {
        Drone drone1 = new Drone("DR001", 85);
        Drone drone2 = new Drone("DR002", 60);
        Drone drone3 = new Drone("DR003", 45);

        System.out.println("Company Name: " + Drone.companyName);
        drone1.displayDroneDetails();
        drone2.displayDroneDetails();
        drone3.displayDroneDetails();

        // Update battery percentage
        drone1.updateBattery(90);
        drone2.updateBattery(75);
        drone3.updateBattery(50);

        System.out.println("\nUpdated Drone Details:");
        drone1.displayDroneDetails();
        drone2.displayDroneDetails();
        drone3.displayDroneDetails();
    }
    
}
// Drone class added to resolve "Drone cannot be resolved to a type"
class Drone {
    String droneId;
    int batteryPercentage;
    static String companyName = "SkyLogistics";

    // Constructor using this to initialize instance variables
    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    void displayDroneDetails() {
        System.out.println("Drone ID: " + droneId + ", Battery: " + batteryPercentage + "%");
    }

    void updateBattery(int newPercentage) {
        this.batteryPercentage = newPercentage;
    }
}
