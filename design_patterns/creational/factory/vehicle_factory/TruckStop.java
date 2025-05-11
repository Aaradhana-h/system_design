package design_patterns.creational.factory.vehicle_factory;

public class TruckStop implements VehicleStop{
    @Override
    public void stop() {
        System.out.println("Truck stopped");
    }
}
