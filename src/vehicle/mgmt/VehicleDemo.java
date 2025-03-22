package vehicle.mgmt;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[]  vehicles = {
                new LandVehicle("LCGC", 60, 40, 4),
                new WaterVehicle("Speedboat", 70, 100, true),
                new LandVehicle("Mobil Intel", 240, 88, 4),
                new LandVehicle("Bemo", 30, 30, 3),
                new WaterVehicle("Sailor Boat", 10, 0, false)
        };
    }
}
