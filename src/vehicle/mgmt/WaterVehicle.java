package vehicle.mgmt;

public class WaterVehicle extends Vehicle {
    // A more specific field
    private boolean hasPropeller;

    // Subclass constructor: takes args value, call the super's constructor and pass the value.
    public WaterVehicle(String name, int speed, double fuelLevel, boolean hasPropeller, int maxSpeed) {
        super(name, speed, fuelLevel, maxSpeed);
        this.setHasPropeller(hasPropeller);
    }

    // Getter for WaterVehicle field
    public boolean isHasPropeller() {
        return hasPropeller;
    }

    // Setter for WaterVehicle field
    public void setHasPropeller(boolean hasPropeller) {
        this.hasPropeller = hasPropeller;
    }

    @Override // optional, but will make sure we have a matching signature with parent.
    public void move() {
        System.out.println(getName() + " is moving on water at " + getSpeed() + " km/h speed, use propeller: " + isHasPropeller() + ".");
    }

    @Override
    public void calculateFuelConsumption(double distance) {
        double fuelConsumption = distance / 8;
        double newFuelLevel = getFuelLevel() - fuelConsumption;

        // Will assign newFuelLevel only if it passed the validation.
        newFuelLevel = validateFuelLevel(newFuelLevel);
        setFuelLevel(newFuelLevel);

        System.out.println("Fuel consumed for " + distance + " km: " + fuelConsumption + ". Remaining fuel level: " + getFuelLevel());
    }

    @Override
    public void stop() {
        System.out.println(getName() + " is now stopping...Stopped.");
    }

    @Override
    public void maxSpeed() {
        System.out.println(getName() + " is moving at max speed " + getMaxSpeed() + " km/h.");
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
}
