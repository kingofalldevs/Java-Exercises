package superKeyword;

public class Gun {
    String brand;
    double caliber;

    public Gun(){}
    //constructor
    public Gun(String brand, double caliber){
        this.brand = brand;
        this.caliber = caliber;
    }

    //shoot method
    void shoot(){
        System.out.println("Click....Boom!");
    }

}
