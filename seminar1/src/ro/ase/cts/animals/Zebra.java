package ro.ase.cts.animals;

public class Zebra extends Animal{
    private int numberLines;

    public Zebra(String name, int age, FoodType foodType, int numberLines) {
        super(name, age, foodType);
        this.numberLines = numberLines;
    }


    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zookeeper "+zooKeeperName+" feeds zebra "+super.name+" with "+super.foodType);
    }
}
