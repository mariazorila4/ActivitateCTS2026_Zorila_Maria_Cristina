package FactoryMethod.Arta.ro.ase.cts.main;

import FactoryMethod.Arta.ro.ase.cts.enums.TipPictura;
import FactoryMethod.Arta.ro.ase.cts.enums.TipSculptura;
import FactoryMethod.Arta.ro.ase.cts.fabrici.FabricaPictura;
import FactoryMethod.Arta.ro.ase.cts.fabrici.FabricaSculptura;
import FactoryMethod.Arta.ro.ase.cts.familia_de_clase.Exponat;

public class Main {
    public static void main(String[] args) {
        FabricaPictura fabricaPictura=new FabricaPictura();
        FabricaSculptura fabricaSculptura=new FabricaSculptura();

        Exponat acrilic= fabricaPictura.getPictura(TipPictura.ACRILIC, "Maria", "Flori de primavara", 400.0f);
        Exponat ulei=fabricaPictura.getPictura(TipPictura.ULEI, "Irina", "Apus de soare", 100.0f);
        Exponat gouache= fabricaPictura.getPictura(TipPictura.GOUACHE, "Cristina", "Ploaie in culori", 150.0f);

        Exponat bronz= fabricaSculptura.getSculptura(TipSculptura.BRONZ, "Alin", "Soldatul necunoscut", 200.0f);
        Exponat ceramica=fabricaSculptura.getSculptura(TipSculptura.CERAMICA, "Ioana", "Vaza fermecata", 50.0f);
        Exponat marmura= fabricaSculptura.getSculptura(TipSculptura.MARMURA, "Miruna", "Inger pur", 100.0f);

        acrilic.afiseazaDetalii();
        ulei.afiseazaDetalii();
        gouache.afiseazaDetalii();

        bronz.afiseazaDetalii();
        ceramica.afiseazaDetalii();
        marmura.afiseazaDetalii();
    }
}
