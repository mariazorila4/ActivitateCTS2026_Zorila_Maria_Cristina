package Flyweight.ro.ase.cts.main;

import Flyweight.ro.ase.cts.clase.ManagerCiresi;
import Flyweight.ro.ase.cts.clase.PozitieCires;

public class Main {
    public static void main(String[] args) {
        PozitieCires nord=new PozitieCires(50, 100, 3);
        PozitieCires sud=new PozitieCires(40, 60, 2);

        ManagerCiresi managerCiresi=new ManagerCiresi();
        managerCiresi.getCires("japonez", "roz", 102).afiseazaCires(nord);
        managerCiresi.getCires("de mai", "albe", 101).afiseazaCires(sud);
    }
}
