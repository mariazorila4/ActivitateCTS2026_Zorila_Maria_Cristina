package Facade.ro.ase.cts.clase;

public class BordSTB {
    private UsaFata fata;
    private UsaMijloc mijloc;
    private UsaSpate spate;

    public BordSTB(UsaFata fata, UsaMijloc mijloc, UsaSpate spate) {
        this.fata = fata;
        this.mijloc = mijloc;
        this.spate = spate;
    }

    public void deschideToateUsile(){
        fata.deschideFortata();
        mijloc.deschideFortata();
        spate.deschideFortata();
    }

    public void liberToateUsile(){
        fata.elibereazaModControl();
        mijloc.elibereazaModControl();
        spate.elibereazaModControl();
    }
}
