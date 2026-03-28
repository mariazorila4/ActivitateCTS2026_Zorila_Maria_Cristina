package FactoryMethod.Transport.ro.ase.cts.fabrici;

import FactoryMethod.Transport.ro.ase.cts.clase.Autobuz;
import FactoryMethod.Transport.ro.ase.cts.clase.MijlocTransport;
import FactoryMethod.Transport.ro.ase.cts.clase.Tramvai;
import FactoryMethod.Transport.ro.ase.cts.clase.Troleibuz;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportSubteran;
import FactoryMethod.Transport.ro.ase.cts.enums.TipTransportTerestru;

public class FabricaTransportTerestru implements FabricaMijlocTransport{
    @Override
    public MijlocTransport getTransportTerestru(TipTransportTerestru tip, String nrInmatriculare, int nrRoti) {
        if(tip==TipTransportTerestru.AUTOBUZ){
            return new Autobuz(nrInmatriculare, nrRoti);
        }
        if(tip==TipTransportTerestru.TRAMVAI){
            return new Tramvai(nrInmatriculare, nrRoti);
        }
        if(tip==TipTransportTerestru.TROLEIBUZ){
            return new Troleibuz(nrInmatriculare, nrRoti);
        }
        return null;
    }

    @Override
    public MijlocTransport getTransportSubteran(TipTransportSubteran tip, String nrInmatriculare, int nrRoti, String magistrala) {
        return null;
    }
}
