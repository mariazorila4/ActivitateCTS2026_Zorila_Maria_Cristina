package FactoryMethod.Arta.ro.ase.cts.fabrici;

import FactoryMethod.Arta.ro.ase.cts.enums.TipPictura;
import FactoryMethod.Arta.ro.ase.cts.enums.TipSculptura;
import FactoryMethod.Arta.ro.ase.cts.familia_de_clase.Exponat;

public interface FabricaExponat {
    Exponat getPictura(TipPictura tip, String numeArtist, String titluTablou, float pret);
    Exponat getSculptura(TipSculptura tip, String numeSculptor, String titluSculptura, float pret);
}
