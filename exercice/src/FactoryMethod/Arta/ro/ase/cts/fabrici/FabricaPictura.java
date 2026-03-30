package FactoryMethod.Arta.ro.ase.cts.fabrici;

import FactoryMethod.Arta.ro.ase.cts.enums.TipPictura;
import FactoryMethod.Arta.ro.ase.cts.enums.TipSculptura;
import FactoryMethod.Arta.ro.ase.cts.familia_de_clase.*;

public class FabricaPictura implements FabricaExponat{
    @Override
    public Exponat getPictura(TipPictura tip, String numeArtist, String titluTablou, float pret) {
        if(tip==TipPictura.ACRILIC){
            return new PicturaAcrilic(numeArtist, titluTablou, pret);
        }
        if(tip==TipPictura.GOUACHE){
            return new PicturaGouache(numeArtist, titluTablou, pret);
        }
        if(tip==TipPictura.ULEI){
            return new PicturaUlei(numeArtist, titluTablou, pret);
        }
        return null;
    }

    @Override
    public Exponat getSculptura(TipSculptura tip, String numeSculptor, String titluSculptura, float pret) {
        return null;
    }
}
