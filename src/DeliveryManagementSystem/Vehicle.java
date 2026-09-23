package DeliveryManagementSystem;

public abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private Double capacity;

    public Double getCapacity() {
        return capacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public abstract void move();
    public void displayInfo(){
        System.out.println("This is a "+brand+ "with "+capacity+ "and Id: "+vehicleId);
    }
}
