package Observer.ro.ase.cts.main;

import Observer.ro.ase.cts.clase.AlarmaAbonat;
import Observer.ro.ase.cts.clase.AlarmaObserver;
import Observer.ro.ase.cts.clase.Cocosel;
import Observer.ro.ase.cts.clase.GestionareAbonati;

public class Main {
    public static void main(String[] args) {
        AlarmaObserver ursulet=new AlarmaAbonat("Barni");
        AlarmaObserver iepuras=new AlarmaAbonat("Bocanila");
        AlarmaObserver caprioara=new AlarmaAbonat("Bambi");

        GestionareAbonati notificator=new Cocosel("10:00");
        notificator.abonarePuiAnimal(ursulet);
        notificator.abonarePuiAnimal(iepuras);
        notificator.abonarePuiAnimal(caprioara);

        notificator.rasareSoarele();
        notificator.dezabonarePuiAnimal(ursulet);
        notificator.rasareSoarele();
    }
}
