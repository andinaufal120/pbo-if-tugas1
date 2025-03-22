package vehicle.mgmt;

public class WaterVehicle extends Vehicle {
    // A more specific field
    boolean hasPropeller;

    // Subclass constructor: takes args value, call the super's constructor and pass the value.
    public WaterVehicle(String name, int speed, double fuelLevel) {
        super(name, speed, fuelLevel);
    }

    @Override // optional, but will make sure we have a matching signature with parent.
    public void move() {
        System.out.println(getName() + " is moving on water at " + getSpeed() + " km/h speed, use propeller: " + hasPropeller + ".");
    }

    @Override
    public void calculateFuelConsumption(double distance) {
        double fuelConsumption = distance / 8;
        System.out.println("Fuel consumed for " + distance + " km: " + fuelConsumption);
    }
}
