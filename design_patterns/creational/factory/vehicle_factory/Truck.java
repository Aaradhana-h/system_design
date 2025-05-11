package design_patterns.creational.factory.vehicle_factory;

public class Truck extends Vehicle {


    public Truck(int vehicleId, String name, int model, int top_speed,VehicleStart vehicleStart,VehicleStop vehicleStop) {
        super(vehicleId, name, model, top_speed,vehicleStart,vehicleStop);
    }
}
