package DeliveryManagementSystem;

public abstract class Vehicle {
    String vehicleId;
    String brand;
    Double capacity;


    public abstract void move();
    public void displayInfo(){
        System.out.println("This is a "+brand+ "with "+capacity+ "and Id: "+vehicleId);
    }
}
