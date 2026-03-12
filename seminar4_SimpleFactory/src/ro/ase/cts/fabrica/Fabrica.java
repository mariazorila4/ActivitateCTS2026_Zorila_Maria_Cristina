package ro.ase.cts.fabrica;

import ro.ase.cts.familie_clase.Autobuz;
import ro.ase.cts.familie_clase.MijlocTransport;
import ro.ase.cts.familie_clase.Tramvai;
import ro.ase.cts.familie_clase.Troleibuz;

public class Fabrica {
    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String numarInmatriculare){
        if(tip==Tipuri.AUTOBUZ){
            return new Autobuz(numarRoti, numarInmatriculare);
        }
        if(tip==Tipuri.TRAMVAI){
            return new Tramvai(numarRoti, numarInmatriculare);
        }
        if(tip==Tipuri.TROLEIBUZ){
            return new Troleibuz(numarRoti, numarInmatriculare);
        }
        return null;
    }
}
