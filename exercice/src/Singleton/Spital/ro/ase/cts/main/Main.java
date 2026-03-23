package Singleton.Spital.ro.ase.cts.main;

import Singleton.Spital.ro.ase.cts.clasa.LogCenter;

public class Main {
    public static void main(String[] args) {
        LogCenter log1=LogCenter.getInstance("activitateTranzitie.pdf",12,"slab");
        LogCenter log2=LogCenter.getInstance("stocareMedicamente.csv", 60, "mediu");

        log2.afiseazaDetaliiLogger();
        log1.afiseazaDetaliiLogger();
        log1.securizeazaFisier("ridicat");
        log1.afiseazaDetaliiLogger();
    }
}
