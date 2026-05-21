package Command.ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Chelner {
    private List<Command> comenzi;

    public Chelner() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command command){
        comenzi.add(command);
    }

    public void preiaComanda(){
        if(comenzi.size()>0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}
