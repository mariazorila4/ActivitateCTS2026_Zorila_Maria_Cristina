package Decorator.ro.ase.cts.main;

import Decorator.ro.ase.cts.clase.Costum;
import Decorator.ro.ase.cts.decorator.CostumDecorator;
import Decorator.ro.ase.cts.decorator.CostumLedDecorator;
import Decorator.ro.ase.cts.decorator.CostumSclipiciDecorator;

public class Main {
    public static void main(String[] args) {
        Costum costumHalloween=new Costum("zana cu aripi", 100.0f);
        costumHalloween.calculeazaPret();

        CostumDecorator sclipici=new CostumSclipiciDecorator(costumHalloween, "mov");
        sclipici.descrieCostumComplet();

        CostumDecorator led=new CostumLedDecorator(costumHalloween);
        led.descrieCostumComplet();
    }
}
