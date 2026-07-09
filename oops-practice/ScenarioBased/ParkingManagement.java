//  Smart Parking Management
// Scenario:
// A mall parking system tracks parked vehicles.
// Requirements:
// Create a class Vehicle
// vehicleNumber
// ownerName
// vehicleType
// Use a constructor and this.
// Store 10 vehicles in an array.
// Write methods:
// displayCars()
// displayBikes()
// Print vehicles based on type.

public class ParkingManagement {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Vehicle("KA-01-AB-1234", "John Doe", "Car");
        vehicles[1] = new Vehicle("KA-02-CD-5678", "Jane Smith", "Bike");
        vehicles[2] = new Vehicle("KA-03-EF-9012", "Alice Johnson", "Car");
        vehicles[3] = new Vehicle("KA-04-GH-3456", "Bob Brown", "Bike");
        vehicles[4] = new Vehicle("KA-05-IJ-7890", "Charlie Davis", "Car");
        vehicles[5] = new Vehicle("KA-06-KL-2345", "Diana Evans", "Bike");
        vehicles[6] = new Vehicle("KA-07-MN-6789", "Ethan Harris", "Car");
        vehicles[7] = new Vehicle("KA-08-OP-0123", "Fiona Green", "Bike");
        vehicles[8] = new Vehicle("KA-09-QR-4567", "George White", "Car");
        vehicles[9] = new Vehicle("KA-10-ST-8901", "Hannah Black", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }

    private static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars in the parking lot:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
                System.out.println(vehicle);
            }
        }
    }

    private static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\nBikes in the parking lot:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equalsIgnoreCase("Bike")) {
                System.out.println(vehicle);
            }
        }
    }
    
}

class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return vehicleNumber + " - " + ownerName + " (" + vehicleType + ")";
    }
}
