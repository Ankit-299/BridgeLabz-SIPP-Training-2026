//  Electric Vehicle Charging Network 
// Scenario
// A charging company manages EV charging stations.
// Requirements
// Create a class ChargingStation.
// Static Variables
// totalStations
// electricityRate
// Instance Variables
// stationId
// unitsConsumed
// Constructor
// Initialize stationId using this.
// Increment totalStations.
// Methods
// calculateBill()
// displayStationDetails()
// Additional Rule
// Changing electricity rates should affect all stations immediately.
// Create 5 stations and calculate bills.

public class ElectricalVehical {
    public static void main(String[] args) {
        ChargingStation station1 = new ChargingStation("ST001", 50);
        ChargingStation station2 = new ChargingStation("ST002", 30);
        ChargingStation station3 = new ChargingStation("ST003", 70);
        ChargingStation station4 = new ChargingStation("ST004", 40);
        ChargingStation station5 = new ChargingStation("ST005", 60);

        System.out.println("Initial Electricity Rate: " + ChargingStation.electricityRate + " per unit");
        station1.displayStationDetails();
        station2.displayStationDetails();
        station3.displayStationDetails();
        station4.displayStationDetails();
        station5.displayStationDetails();

        // Change electricity rate
        ChargingStation.electricityRate = 12.0;
        System.out.println("\nUpdated Electricity Rate: " + ChargingStation.electricityRate + " per unit");

        // Display updated bills
        station1.displayStationDetails();
        station2.displayStationDetails();
        station3.displayStationDetails();
        station4.displayStationDetails();
        station5.displayStationDetails();
    }
    
}

class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 10.0;

    String stationId;
    int unitsConsumed;

    ChargingStation(String stationId, int unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID: " + stationId + ", Units Consumed: " + unitsConsumed + ", Bill: " + calculateBill());
    }
}

