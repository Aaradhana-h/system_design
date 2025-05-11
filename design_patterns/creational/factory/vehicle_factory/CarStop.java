package design_patterns.creational.factory.vehicle_factory;

public class CarStop implements VehicleStop{
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
