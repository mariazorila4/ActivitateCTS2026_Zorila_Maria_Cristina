package WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.fabrica;

import WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.familia_de_clase.*;

import java.util.HashMap;
import java.util.Map;

public class FabricaMijlocTransport {
    //verifica dc exista deja obiectul creat in map, dc nu, il face o singura data
    private static Map<TipMijlocTransport, MijlocTransport> prototypes=new HashMap<>();

    public static MijlocTransport getMijlocTransport(TipMijlocTransport tip, String nrInmatriculare, int nrRoti, int nrLocuri){
        if(!prototypes.containsKey(tip)){
            if(tip==TipMijlocTransport.AUTOBUZ){
                prototypes.put(tip, new Autobuz(nrInmatriculare, nrRoti, nrLocuri));
            }
            if(tip==TipMijlocTransport.TRAMVAI){
                prototypes.put(tip, new Tramvai(nrInmatriculare, nrRoti, nrLocuri));
            }
            if(tip==TipMijlocTransport.TROLEIBUZ){
                prototypes.put(tip, new Troleibuz(nrInmatriculare, nrRoti, nrLocuri));
            }
        }

        //returneaza o clona fara validari
        return prototypes.get(tip).clone();
    }

}
