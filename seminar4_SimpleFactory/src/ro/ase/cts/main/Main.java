package ro.ase.cts.main;

import ro.ase.cts.fabrica.Fabrica;
import ro.ase.cts.fabrica.Tipuri;
import ro.ase.cts.familie_clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        MijlocTransport autobuz=fabrica.getMijlocTransport(Tipuri.AUTOBUZ, 4, "B123ABC");
        MijlocTransport tramvai= fabrica.getMijlocTransport(Tipuri.TRAMVAI, 20, "B342GUI");
        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
    }
}
