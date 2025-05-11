package design_patterns.creational.factory.vehicle_factory;

public class Vehicle {


    private int vehicleId;
    private String name;
    private int model;
    private int top_speed;
    private VehicleStart vehicleStart;
    private VehicleStop vehicleStop;

    public Vehicle(int vehicleId, String name, int model, int top_speed,VehicleStart vehicleStart,VehicleStop vehicleStop) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.model = model;
        this.top_speed = top_speed;
        this.vehicleStart = vehicleStart;
        this.vehicleStop = vehicleStop;
    }

    public void start(){
//        System.out.println("Vehicle started");
        vehicleStart.start();
    }

    public void stop(){
        vehicleStop.stop();
    }


    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }
}
