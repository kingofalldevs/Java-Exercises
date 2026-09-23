package DeliveryManagementSystem;

import java.util.ArrayList;

public class Operations {
    //vehicles
    MotorCycle motorCycle = new MotorCycle();
    MotorCycle secondMotorCycle = new MotorCycle();
    Car car = new Car();
    Car secondCar = new Car();
    Truck truck = new Truck();
    Truck secondTruck = new Truck();
    //Delivery Types
    FoodDelivery foodDelivery = new FoodDelivery();
    PackageDelivery packageDelivery = new PackageDelivery();

    //add motorCycle
    ArrayList<MotorCycle> motorCycles = new ArrayList<>();
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Truck> trucks = new ArrayList<>();

    //pass in vehicle objects
    //add vehicles
    public void addVehicles(){
        //motorCycle 1
        motorCycle.setVehicleId("EI-44urj");
        motorCycle.setBrand("Suzuki");
        motorCycle.setCapacity(458.34);
        motorCycles.addFirst(motorCycle);
        //motorcycle 2(Create another object for this )
        secondMotorCycle.setVehicleId("MI-44urj");
        secondMotorCycle.setBrand("Yamaha");
        secondMotorCycle.setCapacity(831.34);
        motorCycles.add(secondMotorCycle);
        //car 1
        car.setBrand("Ford");
        car.setCapacity(648.21);
        car.setVehicleId("QW-2335");
        cars.addFirst(car);
        //car 2
        secondCar.setBrand("Nissan");
        secondCar.setCapacity(648.21);
        secondCar.setVehicleId("II-78165");
        cars.add(secondCar);

        //Truck 1
        truck.setBrand("Toyota");
        truck.setCapacity(770.43);
        truck.setVehicleId("YU-57438");
        trucks.addFirst(truck);
        //Truck 2
        secondTruck.setBrand("Man");
        secondTruck.setCapacity(770.43);
        secondTruck.setVehicleId("KU-5738");
        trucks.add(secondTruck);
    }


    public void listVehicles(){
        ArrayList<Vehicle> vehicle = new ArrayList<>();
        vehicle.addAll(motorCycles);
        vehicle.addAll(cars);
        vehicle.addAll(trucks);

       for (Vehicle x : vehicle){
           System.out.println(x.getBrand()+" "+x.getVehicleId()+ " " +x.getCapacity());
       }
    }
}
