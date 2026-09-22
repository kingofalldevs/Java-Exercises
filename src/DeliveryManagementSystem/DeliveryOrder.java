package DeliveryManagementSystem;

public class DeliveryOrder {
    private String orderId ;
    private String customer;
    private String delivery;
    private String vehicle;
    private double distance;

    DeliveryOrder(String orderId, String customer,String delivery,String vehicle, double distance){
        this.orderId = orderId;
        this.customer = customer;
        this.delivery = delivery;
        this.vehicle = vehicle;
        this.distance = distance;
    }

    public String getOrderId() {return orderId;}

    public String getCustomer() {return customer;}

    public String getDelivery() {return delivery;}

    public String getVehicle() {return vehicle;}

    public double getDistance() {return distance;}

    public void setOrderId(String orderId) {this.orderId = orderId;}

    public void setCustomer(String customer) {this.customer = customer;}

    public void setDelivery(String delivery) {this.delivery = delivery;}

    public void setVehicle(String vehicle) {this.vehicle = vehicle;}

    public void setDistance(double distance) {this.distance = distance;}
}
