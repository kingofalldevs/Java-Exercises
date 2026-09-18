package com.Inheritance;

public class Main {
    public static void main(String[] args) {
        Organism organism = new Organism();
        Plant plant = new Plant();
        System.out.println(plant.getCellularStructure());
        System.out.println(plant.getNucleus());
        plant.setCellularStructure("Unicellular");
        System.out.println(plant.getCellularStructure());
        //System.out.println(organism.getNucleus());
        //System.out.println(organism.getCellularStructure());

    }
}
