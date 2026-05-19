package Decorator.ro.ase.cts.decorator;

import Decorator.ro.ase.cts.clase.Costum;
import Decorator.ro.ase.cts.clase.CostumAbstract;

public abstract class CostumDecorator implements CostumAbstract {
    protected Costum costumDecorat;

    public CostumDecorator(Costum costumDecorat) {
        this.costumDecorat = costumDecorat;
    }

    @Override
    public void calculeazaPret() {
        costumDecorat.calculeazaPret();
    }

    public abstract void descrieCostumComplet();
}
