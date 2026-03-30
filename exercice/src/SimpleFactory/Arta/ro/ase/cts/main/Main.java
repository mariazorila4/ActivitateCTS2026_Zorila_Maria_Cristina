package SimpleFactory.Arta.ro.ase.cts.main;

import SimpleFactory.Arta.ro.ase.cts.fabrica.GalerieArta;
import SimpleFactory.Arta.ro.ase.cts.fabrica.TipTablou;
import SimpleFactory.Arta.ro.ase.cts.familia_de_clase.Tablou;
import SimpleFactory.Arta.ro.ase.cts.familia_de_clase.TablouAcrilic;

public class Main {
    public static void main(String[] args) {
        GalerieArta galerie=new GalerieArta();

        Tablou tab1=galerie.getTablou(TipTablou.ACRILIC, "Maria", "Marioara Florioara", 200.00f);
        Tablou tab2=galerie.getTablou(TipTablou.GOUACHE, "Cristina", "Vraja Bioluminii", 300.00f);
        Tablou tab3= galerie.getTablou(TipTablou.ULEI, "Irina", "Noapte instelata", 150.00f);

        tab1.afiseazaDetalii();
        tab2.afiseazaDetalii();
        tab3.afiseazaDetalii();
    }
}
