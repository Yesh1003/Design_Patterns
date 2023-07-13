package Creational_Design_Patterns.Builder;

// Concrete builder class - VillaBuilder
public class VillaBuilder extends HouseBuilder {
    public void buildFoundation() {
        house.setFoundation("Villa Foundation");
    }

    public void buildStructure() {
        house.setStructure("Villa Structure");
    }

    public void buildRoof() {
        house.setRoof("Villa Roof");
    }

    public void buildInterior() {
        house.setInterior("Villa Interior");
    }
}

