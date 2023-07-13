package Creational_Design_Patterns.Builder;

public class Main {
    public static void main(String[] args) {

        HouseBuilder villaBuilder = new VillaBuilder();
        ConstructionEngineer engineer1 = new ConstructionEngineer(villaBuilder);
        engineer1.constructHouse();
        House villa = engineer1.getHouse();
        System.out.println(villa);

        HouseBuilder mansionBuilder = new MansionBuilder();
        ConstructionEngineer engineer2 = new ConstructionEngineer(mansionBuilder);
        engineer2.constructHouse();
        House mansion = engineer2.getHouse();
        System.out.println(mansion);
    }
}

