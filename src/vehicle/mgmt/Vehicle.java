package vehicle.mgmt;

public abstract class Vehicle {
    // Fields
    private String name;
    private int speed;
    private double fuelLevel;

    // Constructor: initialize each fields from caller's arguments (which is the subclasses).
    public Vehicle(String name, int speed, double fuelLevel) {
        this.name = name;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    // Getter: will return name, speed, fuelLevel to caller.
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    // Abstract methods: don't have method body, must be implemented by subclasses.
    public abstract void move();
    public abstract void calculateFuelConsumption(double distance);
}
