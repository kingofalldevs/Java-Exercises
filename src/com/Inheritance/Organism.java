package com.Inheritance;

public class Organism {
    private boolean nucleus = true;
    private String cellularStructure = "multicellular";

   // public Organism(boolean nucleus,String cellularStructure){
    //    this.nucleus = nucleus;
     //   this.cellularStructure = cellularStructure;
    //}

    public void setNucleus(boolean nucleus) {
        this.nucleus = nucleus;
    }

    public void setCellularStructure(String cellularStructure) {
        this.cellularStructure = cellularStructure;
    }

    public boolean getNucleus() {
        return nucleus;
    }

    public String getCellularStructure() {
        return cellularStructure;
    }

    void metabolize(){
        System.out.println("Organism is processing energy");
    }

}
