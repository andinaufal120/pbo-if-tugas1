package vehicle.mgmt;

public interface Refuelable {
    void refuel(double amount);

    boolean isFuelLow();
}
