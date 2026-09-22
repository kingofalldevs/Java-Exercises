package DeliveryManagementSystem;

public interface Deliverable {
    void deliver();

    double calculateShippingCost(double distance);
}
