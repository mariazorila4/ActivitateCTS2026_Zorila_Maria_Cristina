package Singleton.MiauCafe.ro.ase.cts.main;

import Singleton.MiauCafe.ro.ase.cts.clasa.ManagerSuprem;

public class Main {
    public static void main(String[] args) {
        ManagerSuprem luna=ManagerSuprem.getInstance("Luna", "este okey momentan", 5);
        ManagerSuprem intrus=ManagerSuprem.getInstance("Stea", "este okey momentan", 7);

        intrus.afiseazaInfoManagerSuprem();
        luna.afiseazaInfoManagerSuprem();
        luna.onoreazaManagerulSuprem();
    }
}
