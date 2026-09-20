package com.LogisticDeliverySystem;

public class DeliveryPackage {
    private String trackingId;
    private String destination;
    private double weight;
    private String status;
    //constructor
    DeliveryPackage(String trackingId,String destination, double weight, String status){
        this.trackingId = trackingId;
        this.destination = destination;
        this.weight = weight;
        this.status = status;
    }
    //setters
    public String getTrackingId() { return trackingId;}
    public String getDestination() {return destination;}
    public double getWeight() {return weight;}
    public String getStatus() {return status;}
    //getters
    public void setTrackingId(String trackingId) {this.trackingId = trackingId;}
    public void setDestination(String destination) {this.destination = destination;}
    public void setWeight(double weight) { this.weight = weight;}
    public void setStatus(String status) {this.status = status;}
    //calculateShippingCost method
    public double calculateShippingCost(){
        return weight * 20;
    }
}
//Attributes to create: trackingId (String), destination (String), weight (double), and status (String).
// Rules: Make all fields completely private. Provide a constructor to initialize them and create the appropriate public getters and setters.
// Method to design: A method called calculateShippingCost() that returns a double calculated by multiplying the weight by a base rate (e.g., 20 GHS per kg).