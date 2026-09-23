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
        //motorCycle 1
        motorCycle.setVehicleId("EI-44urj");
        motorCycle.setBrand("Suzuki");
        motorCycle.setCapacity(458.34);
        motorCycles.addFirst(motorCycle);
        //motorcycle 2
        motorCycle.setVehicleId("MI-44urj");
        motorCycle.setBrand("Yamaha");
        motorCycle.setCapacity(831.34);
        motorCycles.addFirst(motorCycle);
        //car 1
        car.setBrand("Ford");
        car.setCapacity(648.21);
        car.setVehicleId("QW-2335");
        //car 2
        car.setBrand("Nissan");
        car.setCapacity(648.21);
        car.setVehicleId("II-78165");
        //Truck 1
        truck.setBrand("Toyota");
        truck.setCapacity(770.43);
        truck.setVehicleId("YU-57438");
        //Truck 2
        truck.setBrand("Man");
        truck.setCapacity(770.43);
        truck.setVehicleId("KU-5738");
    }
}
