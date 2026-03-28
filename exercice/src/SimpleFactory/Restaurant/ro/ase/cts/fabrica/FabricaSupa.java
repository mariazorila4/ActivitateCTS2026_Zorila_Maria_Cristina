package SimpleFactory.Restaurant.ro.ase.cts.fabrica;

import SimpleFactory.Restaurant.ro.ase.cts.familie_de_clase.Supa;
import SimpleFactory.Restaurant.ro.ase.cts.familie_de_clase.SupaCiuperci;
import SimpleFactory.Restaurant.ro.ase.cts.familie_de_clase.SupaLegume;
import SimpleFactory.Restaurant.ro.ase.cts.familie_de_clase.SupaVita;

public class FabricaSupa {
    public Supa getSupa(TipSupa tip, int gramaj, float pret){
        if(tip==TipSupa.CIUPERCI){
            return new SupaCiuperci(gramaj,pret);
        }
        if(tip==TipSupa.LEGUME){
            return new SupaLegume(gramaj,pret);
        }
        if(tip==TipSupa.VITA){
            return new SupaVita(gramaj,pret);
        }
        return null;
    }
}
