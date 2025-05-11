package design_patterns.creational.factory.vehicle_factory;

import java.util.Objects;

public class Vehicle_factory {

    public static Vehicle createVehicle(String type){
        if("Car".equals(type)){
            return new Car(101,"Mercedes",2020,100,new CarStart(),new CarStop());
        }
        else if("Truck".equals(type)){
            return new Truck(110,"Tata",2002,50,new TruckStart(),new TruckStop());
        }
        else
            throw new IllegalArgumentException("Unknown vehicle type: " + type);
    }




}
