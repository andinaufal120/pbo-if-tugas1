package vehicle.mgmt;

public abstract class Vehicle implements Refuelable {
    // Fields
    private String name;
    private int speed;
    private double fuelLevel;
    private int maxSpeed;


    // Constructor: initialize each fields from caller's arguments (which is the subclasses).
    public Vehicle(String name, int speed, double fuelLevel, int maxSpeed) {
        this.name = name;
        this.speed = validateSpeed(speed);
        this.fuelLevel = validateFuelLevel(fuelLevel);
        this.maxSpeed = validateSpeed(maxSpeed);
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Setter: I can't access instance variable directly.
    public void setName(String name) {
        this.name = name; // can be like this; "this" keyword refers to the instance var.
    }

    public void setSpeed(int newSpeed) {
        speed = validateSpeed(newSpeed); // but I prefer this.
    }

    public void setFuelLevel(double newFuelLevel) {
        fuelLevel = validateFuelLevel(newFuelLevel);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = validateSpeed(maxSpeed);
    }

    // Abstract methods: don't have method body, must be implemented by subclasses.
    public abstract void move();

    public abstract void calculateFuelConsumption(double distance);


    // Additional features: extra abstract methods
    public abstract void stop();

    public abstract void maxSpeed();


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

    public int validateSpeed(int newValue) {
        // reversing doesn't make speed negative, unless we're talking about velocity.
        return (newValue < 0) ? Math.abs(newValue) : newValue;
    }
}
