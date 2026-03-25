package Singleton.Scoala.ro.ase.cts.main;

import Singleton.Scoala.ro.ase.cts.clasa.CatalogElectronic;

public class Main {
    public static void main(String[] args) {
        CatalogElectronic ctg1=CatalogElectronic.getInstance("Lic. Tehn. Dimitrie Bolintineanu", 90, "catalogLTDB.db");
        CatalogElectronic ctg2=CatalogElectronic.getInstance("C.N.I.L.C", 120, "catalogCNILC.adb");

        ctg1.afiseazaDetaliiCatalog();
        ctg1.inregistreazaElev("Zorila Maria", "12A - MateInfo");

        ctg2.afiseazaDetaliiCatalog();
    }
}
