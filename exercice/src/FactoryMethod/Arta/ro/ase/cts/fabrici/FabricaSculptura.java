package FactoryMethod.Arta.ro.ase.cts.fabrici;

import FactoryMethod.Arta.ro.ase.cts.enums.TipPictura;
import FactoryMethod.Arta.ro.ase.cts.enums.TipSculptura;
import FactoryMethod.Arta.ro.ase.cts.familia_de_clase.*;

public class FabricaSculptura implements FabricaExponat {
    @Override
    public Exponat getPictura(TipPictura tip, String numeArtist, String titluTablou, float pret) {
        return null;
    }

    @Override
    public Exponat getSculptura(TipSculptura tip, String numeSculptor, String titluSculptura, float pret) {
        if (tip == TipSculptura.BRONZ) {
            return new SculpturaBronz(numeSculptor, titluSculptura, pret);
        }
        if (tip == TipSculptura.CERAMICA) {
            return new SculpturaCeramica(numeSculptor, titluSculptura, pret);
        }
        if (tip == TipSculptura.MARMURA) {
            return new SculpturaMarmura(numeSculptor, titluSculptura, pret);
        }
        return null;
    }
}
