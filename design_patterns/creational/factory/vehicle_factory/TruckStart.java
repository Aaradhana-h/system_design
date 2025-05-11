package design_patterns.creational.factory.vehicle_factory;

public class TruckStart implements VehicleStart{
    @Override
    public void start() {
        System.out.println("Truck Started");
    }
}
