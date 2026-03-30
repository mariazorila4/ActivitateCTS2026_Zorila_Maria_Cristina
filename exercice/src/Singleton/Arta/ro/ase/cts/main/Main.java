package Singleton.Arta.ro.ase.cts.main;

import Singleton.Arta.ro.ase.cts.clasa.Expozitie;

public class Main {
    public static void main(String[] args) {
        Expozitie expozitie=Expozitie.getInstance("Culorile primaverii", 12, 9);

        expozitie.afiseazaDetalii();

        expozitie.expuneTablou("Maria","Peisaj de primavara");
        expozitie.expuneTablou("Elena", "Cer senin");
        expozitie.expuneTablou("Ioana","Intoarcerea acasa");
        expozitie.expuneTablou("Cristina", "Stropi de roua");

        expozitie.afiseazaDetalii();
    }
}
