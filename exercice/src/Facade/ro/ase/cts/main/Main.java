package Facade.ro.ase.cts.main;

import Facade.ro.ase.cts.clase.BordSTB;
import Facade.ro.ase.cts.clase.UsaFata;
import Facade.ro.ase.cts.clase.UsaMijloc;
import Facade.ro.ase.cts.clase.UsaSpate;

public class Main {
    public static void main(String[] args) {
        UsaFata usaFata=new UsaFata();
        UsaMijloc usaMijloc=new UsaMijloc();
        UsaSpate usaSpate=new UsaSpate();

        BordSTB bord=new BordSTB(usaFata, usaMijloc, usaSpate);
        bord.deschideToateUsile();
        bord.liberToateUsile();
    }
}
