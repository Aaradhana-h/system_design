package design_patterns.creational.factory.vehicle_factory;

public class Main {

    public static void main(String [] args) {

        System.out.println("Himanshi");

//        Vehicle v1= new Vehicle_factory("Car").createVehicle();
        Vehicle v1=Vehicle_factory.createVehicle("Car");
        v1.start();
        v1.stop();

        Vehicle v2= Vehicle_factory.createVehicle("Truck");
        v2.start();
        v2.stop();
    }
}
