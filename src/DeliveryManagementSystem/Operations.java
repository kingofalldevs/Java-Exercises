package DeliveryManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Operations {
    Scanner input = new Scanner(System.in);

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

    //Hashmap for  customers
    HashMap<Integer, Customer> customers = new HashMap<>();

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

    public void registerCustomers(){
        System.out.println("How many customers do you want to register: ");
        int No = input.nextInt();

        for(int j = 1; j <= No; j++){
          registerBlueprint();
        }
    }

    public void registerBlueprint(){
        Customer customer = new Customer();
        System.out.println("Enter customer No: ");
        int id = input.nextInt();
        input.nextLine();

        if(customers.containsKey(id)){
            System.out.println("The Id already exists");
            return;
        }
        System.out.println("Enter Name: ");
        customer.setName(input.nextLine());
        System.out.println("Enter Email: ");
        customer.setAddress(input.nextLine());
        System.out.println("Enter Phone");
        customer.setPhone(input.nextLine());
        String customerId = String.format("QWERM%04d", id);
        customer.setCustomerId(customerId);
        customers.put(id,customer);


    }

    public void displayCustomers(){
        System.out.println("CUSTOMER ID"+"\tEMAIL"+"\tNAME");
        System.out.println("_______________________________");
       for (Customer key : customers.values()){
           System.out.println(key.getCustomerId() +"\t"+ key.getAddress()+"\t"+key.getName());
       }
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
