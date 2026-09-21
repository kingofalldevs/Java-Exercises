package superKeyword;

public class Pistol extends Gun {
    int magazineCapacity;
    //Child constructor
    Pistol(String brand, double caliber, int magazineCapacity){
        super(brand, caliber);
        this.magazineCapacity = magazineCapacity;
    }

    //shoot method for the child class
    @Override
    void shoot(){
        super.shoot();
        System.out.println("Cycles the pump action action mechanism");
    }




}
