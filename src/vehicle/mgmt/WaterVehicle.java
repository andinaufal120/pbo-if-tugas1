package vehicle.mgmt;

public class WaterVehicle extends Vehicle {
    // A more specific field
    boolean hasPropeller;

    // Subclass constructor: takes args value, call the super's constructor and pass the value.
    public WaterVehicle(String name, int speed, double fuelLevel, boolean hasPropeller) {
        super(name, speed, fuelLevel);
        this.hasPropeller = hasPropeller;
    }

    @Override // optional, but will make sure we have a matching signature with parent.
    public void move() {
        System.out.println(getName() + " is moving on water at " + getSpeed() + " km/h speed, use propeller: " + hasPropeller + ".");
    }

    @Override
    public void calculateFuelConsumption(double distance) {
        double fuelConsumption = distance / 8;
        double newFuelLevel = getFuelLevel() - fuelConsumption;

        // Will assign newFuelLevel only if it's positive. Otherwise, assign 0.
        newFuelLevel = (newFuelLevel < 0) ? 0 : newFuelLevel;
        setFuelLevel(newFuelLevel);

        System.out.println("Fuel consumed for " + distance + " km: " + fuelConsumption + ". Remaining fuel level: " + getFuelLevel());
    }

    // Refuelable interface's methods implementation
    @Override
    public void refuel(double amount) {
        double newFuelLevel = getFuelLevel() + amount;
        setFuelLevel(newFuelLevel);
    }

    @Override
    public boolean isFuelLow() {
        return getFuelLevel() < 20;
    }
}
