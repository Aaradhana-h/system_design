package design_patterns.creational.factory.vehicle_factory;

public class CarStart implements VehicleStart{
    @Override
    public void start() {
        System.out.println("Car started");
    }
}
