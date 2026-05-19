package Decorator.ro.ase.cts.decorator;

import Decorator.ro.ase.cts.clase.Costum;

public class CostumLedDecorator extends CostumDecorator{
    public CostumLedDecorator(Costum costumDecorat) {
        super(costumDecorat);
    }

    @Override
    public void descrieCostumComplet() {
        this.calculeazaPret();
        System.out.println("Costumul contine lumini led");
    }
}
