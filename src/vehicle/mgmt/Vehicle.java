package vehicle.mgmt;

public abstract class Vehicle {
    // Fields
    private String name;
    private int speed;
    private double fuelLevel;

    // Constructor: initialize each fields.
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

}
