package SimpleFactory.Arta.ro.ase.cts.fabrica;

import SimpleFactory.Arta.ro.ase.cts.familia_de_clase.Tablou;
import SimpleFactory.Arta.ro.ase.cts.familia_de_clase.TablouAcrilic;
import SimpleFactory.Arta.ro.ase.cts.familia_de_clase.TablouGouache;
import SimpleFactory.Arta.ro.ase.cts.familia_de_clase.TablouUlei;

public class GalerieArta {
    public Tablou getTablou(TipTablou tip, String numeArtist, String titluTablou, float pret){
        if(tip==TipTablou.ACRILIC){
            return new TablouAcrilic(numeArtist,titluTablou,pret);
        }
        if(tip==TipTablou.GOUACHE){
            return new TablouGouache(numeArtist,titluTablou,pret);
        }
        if(tip==TipTablou.ULEI){
            return new TablouUlei(numeArtist,titluTablou,pret);
        }
        return null;
    }
}
