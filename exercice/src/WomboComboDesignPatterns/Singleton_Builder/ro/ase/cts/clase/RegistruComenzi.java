package WomboComboDesignPatterns.Singleton_Builder.ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class RegistruComenzi {
    private static RegistruComenzi instance=null;
    private List<String> comenzi;

    private RegistruComenzi(){
        comenzi=new ArrayList<>();
    }

    public static synchronized RegistruComenzi getInstance(){
        if(instance==null){
            instance=new RegistruComenzi();
        }
        return instance;
    }

    public void adaugaComanda(String numeClient, Calculator calculator){
        comenzi.add("Client: "+numeClient+" | Calculator comandat: "+calculator.toString());
    }

    public void afiseazaComenzi(){
        for(String c:comenzi){
            System.out.println(c);
        }
    }
}
