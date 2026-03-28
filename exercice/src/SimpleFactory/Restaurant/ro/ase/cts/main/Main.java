package SimpleFactory.Restaurant.ro.ase.cts.main;

import SimpleFactory.Restaurant.ro.ase.cts.fabrica.FabricaSupa;
import SimpleFactory.Restaurant.ro.ase.cts.fabrica.TipSupa;
import SimpleFactory.Restaurant.ro.ase.cts.familie_de_clase.Supa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabrica=new FabricaSupa();
        Supa ciuperci=fabrica.getSupa(TipSupa.CIUPERCI, 350, 35.00f);
        Supa legume=fabrica.getSupa(TipSupa.LEGUME, 400,40.00f);
        Supa vita=fabrica.getSupa(TipSupa.VITA, 500, 50.00f);

        ciuperci.afiseazaDescriere();
        legume.afiseazaDescriere();
        vita.afiseazaDescriere();
    }
}
