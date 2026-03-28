package FactoryMethod.Transport.ro.ase.cts.main;

import FactoryMethod.Transport.ro.ase.cts.clase.MijlocTransport;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportSubteran;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportTerestru;
import FactoryMethod.Transport.ro.ase.cts.fabrici.FabricaTransportSubteran;
import FactoryMethod.Transport.ro.ase.cts.fabrici.FabricaTransportTerestru;

public class Main {
    public static void main(String[] args) {
        FabricaTransportSubteran subteran=new FabricaTransportSubteran();
        FabricaTransportTerestru terestru=new FabricaTransportTerestru();

        MijlocTransport autobuz= terestru.getTransportTerestru(TipTransportTerestru.AUTOBUZ, "GR04ZMC", 4);
        MijlocTransport tramvai= terestru.getTransportTerestru(TipTransportTerestru.TRAMVAI, "B1220", 20);
        MijlocTransport troleibuz= terestru.getTransportTerestru(TipTransportTerestru.TROLEIBUZ, "IF34567", 6);

        MijlocTransport metrou= subteran.getTransportSubteran(TipTransportSubteran.METROU, "MEDONNO1234", 40, "M2");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        troleibuz.afiseazaDescriere();
        metrou.afiseazaDescriere();
    }
}
