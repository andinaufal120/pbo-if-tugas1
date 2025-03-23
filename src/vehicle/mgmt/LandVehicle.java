package vehicle.mgmt;

public class LandVehicle extends Vehicle {
    // A more specific field
    int wheels;

    // Subclass constructor: takes args value, call the super's constructor and pass the value.
    public LandVehicle(String name, int speed, double fuelLevel, int wheels) {
        super(name, speed, fuelLevel);
        this.wheels = wheels;
    }

    @Override // optional, but will make sure we have a matching signature with parent.
    public void move() {
        System.out.println(getName() + " is moving on land with " +  wheels + " wheels at " + getSpeed() + " km/h speed.");
    }

    @Override
    public void calculateFuelConsumption(double distance) {
        double fuelConsumption = distance / 10;
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
