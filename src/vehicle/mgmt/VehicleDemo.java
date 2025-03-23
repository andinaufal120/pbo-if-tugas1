package vehicle.mgmt;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new LandVehicle("LCGC", 60, 40, 4),
                new WaterVehicle("Speedboat", 70, 100, true),
                new LandVehicle("Mobil Intel", 240, 88, 4),
                new LandVehicle("Bemo", 30, 30, 3),
                new WaterVehicle("Sailor Boat", 10, 0, false)
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
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
