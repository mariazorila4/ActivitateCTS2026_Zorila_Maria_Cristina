package ro.ase.cts.animals;

public class Tiger extends Animal{
    private int weight;

    public Tiger(String name, int age, FoodType foodType, int weight) {
        super(name, age, foodType);
        this.weight = weight;
    }


    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zookeeper "+zooKeeperName+" feeds tiger "+super.name+" with "+super.foodType);
    }
}
