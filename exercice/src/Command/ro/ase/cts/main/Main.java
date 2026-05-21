package Command.ro.ase.cts.main;

import Command.ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Chelner chelner=new Chelner();

        Command pizza=new ComandaPizza(new Bucatar("pizza"), "margherita");
        Command supa=new ComandaSupa(new Bucatar("supa"), "pui");

        chelner.adaugaComanda(pizza);
        chelner.adaugaComanda(supa);
        chelner.preiaComanda();
        chelner.preiaComanda();
    }
}
