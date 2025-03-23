package vehicle.mgmt;

public abstract class Vehicle implements Refuelable {
    // Fields
    private String name;
    private int speed;
    private double fuelLevel;


    // Constructor: initialize each fields from caller's arguments (which is the subclasses).
    public Vehicle(String name, int speed, double fuelLevel) {
        this.name = name;
        this.speed = speed;
        this.fuelLevel = validateFuelLevel(fuelLevel);
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


    // Setter: I can't access instance variable directly.
    public void setName(String name) {
        this.name = name; // can be like this; "this" keyword refers to the instance var.
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed; // but I prefer this.
    }

    public void setFuelLevel(double newFuelLevel) {
        fuelLevel = validateFuelLevel(newFuelLevel);
    }


    // Abstract methods: don't have method body, must be implemented by subclasses.
    public abstract void move();

    public abstract void calculateFuelConsumption(double distance);


    // Additional features: extra validation
    public double validateFuelLevel(double newValue) {
        if (newValue < 0) {
            return 0;
        } else if (newValue > 100) {
            return 100;
        } else {
            return newValue;
        }
    }
}
