package Composite.ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeDoll implements Matrioska{
    private String culoarePapusa;
    private String marime;
    private List<Matrioska> papusiMatrioska;

    public CompositeDoll(String culoarePapusa, String marime) {
        this.culoarePapusa = culoarePapusa;
        this.marime=marime;
        this.papusiMatrioska=new ArrayList<>();
    }

    @Override
    public void afiseazaDetaliiMatrioska() {
        System.out.println("Papusa "+this.marime+" este de culoare "+this.culoarePapusa);
        for(Matrioska m:papusiMatrioska){
            m.afiseazaDetaliiMatrioska();
        }
    }

    public void adaugaMatrioska(Matrioska matrioska){
        papusiMatrioska.add(matrioska);
    }

    public void scoateMatrioska(Matrioska matrioska){
        papusiMatrioska.remove(matrioska);
    }

    public Matrioska getMatrioska(int poz){
        return papusiMatrioska.get(poz);
    }
}
