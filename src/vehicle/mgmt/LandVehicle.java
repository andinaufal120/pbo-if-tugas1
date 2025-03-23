package vehicle.mgmt;

public class LandVehicle extends Vehicle {
    // A more specific field
    private final int wheels; // I don't think someone want to change the wheels number once instantiated.

    // Subclass constructor: takes args value, call the super's constructor and pass the value.
    public LandVehicle(String name, int speed, double fuelLevel, int wheels) {
        super(name, speed, fuelLevel);
        this.wheels = validateWheels(wheels);
    }

    @Override // optional, but will make sure we have a matching signature with parent.
    public void move() {
        System.out.println(getName() + " is moving on land with " +  wheels + " wheels at " + getSpeed() + " km/h speed.");
    }

    @Override
    public void calculateFuelConsumption(double distance) {
        double fuelConsumption = distance / 10;
        double newFuelLevel = getFuelLevel() - fuelConsumption;

        // Will assign newFuelLevel only if it passed the validation.
        newFuelLevel = validateFuelLevel(newFuelLevel);
        setFuelLevel(newFuelLevel);

        System.out.println("Fuel consumed for " + distance + " km: " + fuelConsumption + ". Remaining fuel level: " + getFuelLevel());
    }

    // Refuelable interface's methods implementation
    @Override
    public void refuel(double amount) {
        // Make sure the amount isn't negative, otherwise it's not called "refueling".
        amount = (amount < 0) ? 0 : amount;

        // Adds the refuel amount to current fuel level.
        double newFuelLevel = getFuelLevel() + amount;

        // Will assign newFuelLevel only if it passed the validation.
        newFuelLevel = validateFuelLevel(newFuelLevel);
        setFuelLevel(newFuelLevel);
    }

    @Override
    public boolean isFuelLow() {
        return getFuelLevel() < 20;
    }

    // LandVehicle specific extra validation: wheels
    public int validateWheels(int wheels) {
        return (wheels < 0) ? 0 : wheels;
    }
}
