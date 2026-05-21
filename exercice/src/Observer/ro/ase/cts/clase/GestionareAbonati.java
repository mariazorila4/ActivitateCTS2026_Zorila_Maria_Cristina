package Observer.ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class GestionareAbonati {
    protected List<AlarmaObserver> puiAnimale;
    protected String ora;

    public GestionareAbonati(String ora) {
        this.puiAnimale = new ArrayList<>();
        this.ora=ora;
    }

    public void abonarePuiAnimal(AlarmaObserver puiAnimal){
        puiAnimale.add(puiAnimal);
    }

    public void dezabonarePuiAnimal(AlarmaObserver puiAnimal){
        puiAnimale.remove(puiAnimal);
    }

    public void notificarePuiAnimal(String mesaj){
        for(AlarmaObserver puiAnimal:this.puiAnimale){
            puiAnimal.primesteAlarmaDeDimineata(mesaj);
        }
    }

    public abstract void rasareSoarele();
}
