package superKeyword;

public class Rifle extends Gun {
    int range = 800;

    void compareRanges(){
        System.out.println("Rifle range"+this.range);
        System.out.println("Base gun range:"+super.range);
    }

}
