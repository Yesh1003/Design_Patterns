package Creational_Design_Patterns.Builder;


public abstract class HouseBuilder {
    protected House house;

    public House getHouse() {
        return house;
    }

    public void createNewHouse() {
        house = new House();
    }

    public abstract void buildFoundation();
    public abstract void buildStructure();
    public abstract void buildRoof();
    public abstract void buildInterior();
}

