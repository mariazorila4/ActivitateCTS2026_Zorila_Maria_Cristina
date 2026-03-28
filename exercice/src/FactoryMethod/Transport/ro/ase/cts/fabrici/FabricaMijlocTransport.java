package FactoryMethod.Transport.ro.ase.cts.fabrici;

import FactoryMethod.Transport.ro.ase.cts.clase.MijlocTransport;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportSubteran;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportTerestru;

public interface FabricaMijlocTransport {
    public MijlocTransport getTransportTerestru(TipTransportTerestru tip, String nrInmatriculare, int nrRoti);
    public MijlocTransport getTransportSubteran(TipTransportSubteran tip, String nrInmatriculare, int nrRoti, String magistrala);
}
