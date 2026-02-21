package ro.ase.cts.main;

import ro.ase.cts.animals.FoodType;
import ro.ase.cts.animals.Lion;
import ro.ase.cts.animals.Tiger;
import ro.ase.cts.animals.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String args[]){
        Zoo zoo=new Zoo("Baneasa", new ZooKeeper("Ionescu"));
        Lion lion=new Lion("Leo", 10, FoodType.MEAT, 90);
        Zebra zebra=new Zebra("Zoe", 8, FoodType.GRASS, 100);
        zoo.addAnimal(lion);
        zoo.addAnimal(zebra);
        zoo.addAnimal(new Tiger("Shere Khan", 12, FoodType.FISH, 80));

        zoo.feedAllAnimals();
    }
}
