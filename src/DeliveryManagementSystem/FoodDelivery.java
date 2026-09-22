package DeliveryManagementSystem;

public class FoodDelivery implements Deliverable{

    private double Rate;
    private double baseFee;

    public FoodDelivery(){
        this.Rate = 0.55;
        this.baseFee = 50;
    }

    public double getBaseFee() {return baseFee;}

    public double getRate() {return Rate;}

    public void setBaseFee(double baseFee) {this.baseFee = baseFee;}

    public void setRate(double rate) {Rate = rate;}

    @Override
    public void deliver(){
        System.out.println();
    }
    @Override
    public double calculateShippingCost(double distance){
        return getBaseFee() + distance * getRate();
    }
}


