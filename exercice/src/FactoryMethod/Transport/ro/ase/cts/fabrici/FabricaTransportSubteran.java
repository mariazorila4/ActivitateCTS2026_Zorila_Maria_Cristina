package FactoryMethod.Transport.ro.ase.cts.fabrici;

import FactoryMethod.Transport.ro.ase.cts.clase.Metrou;
import FactoryMethod.Transport.ro.ase.cts.clase.MijlocTransport;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportSubteran;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportTerestru;

public class FabricaTransportSubteran implements FabricaMijlocTransport{
    @Override
    public MijlocTransport getTransportTerestru(TipTransportTerestru tip, String nrInmatriculare, int nrRoti) {
        return null;
    }

    @Override
    public MijlocTransport getTransportSubteran(TipTransportSubteran tip, String nrInmatriculare, int nrRoti, String magistrala) {
        if(tip==TipTransportSubteran.METROU){
            return new Metrou(nrInmatriculare, nrRoti, magistrala);
        }
        return null;
    }
}
