package WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.main;

import WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.fabrica.FabricaMijlocTransport;
import WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.familia_de_clase.MijlocTransport;
import WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.familia_de_clase.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {
        FabricaMijlocTransport fabrica=new FabricaMijlocTransport();
        MijlocTransport autobuz=FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.AUTOBUZ, "IF098765", 6, 24);
        MijlocTransport autobuz2=(MijlocTransport) autobuz.clone();
        MijlocTransport tramvai=FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.TRAMVAI, "B1234567", 20, 80);

        ((MijlocTransport)autobuz2).setNrLocuri(60);

        autobuz.afiseazaDetalii();
        autobuz2.afiseazaDetalii();
        tramvai.afiseazaDetalii();
    }
}
