package vehicle.mgmt;

/**
 * VehicleDemo: this is the main class.
 *
 * @author Andi Naufal Nurfadhil
 */
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new LandVehicle("LCGC", -60, 40, 4, 120),
                new WaterVehicle("Speedboat", 70, -1000, true, 300),
                new LandVehicle("Motor Pak Cahyo", 240, 100, 2, 300_000),
                new LandVehicle("Bemo", 30, 30, 3, 60),
                new WaterVehicle("Sailor Boat", 10, 0, false, 30)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.maxSpeed();
            vehicle.stop();
            vehicle.calculateFuelConsumption(100);
            System.out.println();
        }

        // Refuel vehicles if isFuelLow true.
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isFuelLow()) {
                System.out.println(vehicle.getName() + "'s fuel is low. Refueling 30%...");
                vehicle.refuel(30);
                System.out.println("Refueling completed! The fuel is now " + vehicle.getFuelLevel() + "%.");
            }
        }
    }
}
