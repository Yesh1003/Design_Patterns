package Creational_Design_Patterns.Builder;

public class MansionBuilder extends HouseBuilder {
    public void buildFoundation() {
        house.setFoundation("Mansion Foundation");
    }

    public void buildStructure() {
        house.setStructure("Mansion Structure");
    }

    public void buildRoof() {
        house.setRoof("Mansion Roof");
    }

    public void buildInterior() {
        house.setInterior("Mansion Interior");
    }
}

