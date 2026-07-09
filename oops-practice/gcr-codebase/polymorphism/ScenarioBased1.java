// 1.A transport company manages a fleet: Vehicle[] containing Car, Bus, Bike
// objects. Call fuelCost(km) on each — each type calculates differently. Use
// instanceof before casting. Add a new ElectricCar without changing existing
// code (open/closed principle preview).

abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract double fuelCost(double km);
}

class Car extends Vehicle {
    private double mileage;

    public Car(String name, double mileage) {
        super(name);
        this.mileage = mileage;
    }

    @Override
    public double fuelCost(double km) {
        return km / mileage;
    }
}

class Bus extends Vehicle {
    private double mileage;

    public Bus(String name, double mileage) {
        super(name);
        this.mileage = mileage;
    }

    @Override
    public double fuelCost(double km) {
        return km / mileage;
    }
}

class Bike extends Vehicle {
    private double mileage;

    public Bike(String name, double mileage) {
        super(name);
        this.mileage = mileage;
    }

    @Override
    public double fuelCost(double km) {
        return km / mileage;
    }
}

public class ScenarioBased1 {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[4];
        fleet[0] = new Car("Car1", 15); // 15 km/l
        fleet[1] = new Bus("Bus1", 5);  // 5 km/l
        fleet[2] = new Bike("Bike1", 40); // 40 km/l
        fleet[3] = new ElectricCar("E-Car1", 0.2); // 0.2 kWh/km

        double distance = 100; // distance in km
        for (Vehicle v : fleet) {
            System.out.println(v.getName() + " fuel cost for " + distance + " km: " + v.fuelCost(distance));
        }
    }
    
}

class ElectricCar extends Vehicle {
    private double consumption;

    public ElectricCar(String name, double consumption) {
        super(name);
        this.consumption = consumption;
    }

    @Override
    public double fuelCost(double km) {
        return km * consumption;
    }
}
