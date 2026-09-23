package DeliveryManagementSystem;

import java.util.ArrayList;

public class Operations {
    //vehicles
    MotorCycle motorCycle = new MotorCycle();
    Car car = new Car();
    Truck truck = new Truck();
    //Delivery Types
    FoodDelivery foodDelivery = new FoodDelivery();
    PackageDelivery packageDelivery = new PackageDelivery();

    //add motorCycle
    ArrayList<MotorCycle> motorCycles = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Truck> trucks = new ArrayList<>();

    //pass in vehicle objects
    public void passInVehicles(){
        motorCycles.add(motorCycle);
        cars.add(car);
        trucks.add(truck);
    }
    //add vehicles
    public void addVehicles(){
        motorCycle.setVehicleId("EI-44urj");
        motorCycle.setBrand("Toyota");
        motorCycle.setCapacity(458.34);
        motorCycles.addFirst(motorCycle);
    }
}
