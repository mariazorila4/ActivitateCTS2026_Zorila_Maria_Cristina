package Decorator.ro.ase.cts.decorator;

import Decorator.ro.ase.cts.clase.Costum;

public class CostumSclipiciDecorator extends CostumDecorator{
    private String culoareSclipici;

    public CostumSclipiciDecorator(Costum costumDecorat, String culoareSclipici) {
        super(costumDecorat);
        this.culoareSclipici=culoareSclipici;
    }

    @Override
    public void descrieCostumComplet() {
        this.calculeazaPret();
        System.out.println("Costumul are sclipici de culoare "+this.culoareSclipici);
    }
}
