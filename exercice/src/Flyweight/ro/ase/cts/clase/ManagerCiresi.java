package Flyweight.ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerCiresi {
    Map<Integer, Cires> ciresi=new HashMap<Integer,Cires>();

    public Cires getCires(String specie, String culoareFlori, int codNumeric){
        if(ciresi.containsKey(codNumeric)){
            return ciresi.get(codNumeric);
        }else{
            ciresi.put(codNumeric, new Cires(specie, culoareFlori, codNumeric));
            return ciresi.get(codNumeric);
        }
    }
}
