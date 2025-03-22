package vehicle.mgmt;

public class LandVehicle extends Vehicle {
    // A more specific field
    int wheels;

    // Subclass constructor: takes args value, call the super's constructor and pass the value.
    public LandVehicle(String name, int speed, double fuelLevel) {
        super(name, speed, fuelLevel);
    }

    @Override // optional, but will make sure we have a matching signature with parent.
    public void move() {
        System.out.println(getName() + " is moving on land with " +  wheels + " wheels at " + getSpeed() + " km/h speed");
    }

    @Override
    public void calculateFuelConsumption(double distance) {
        double fuelConsumption = distance / 10;
        // code to subtract fuelLevel
        System.out.println("Fuel consumed for " + distance + " km: " + fuelConsumption);
    }
}
