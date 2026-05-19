package Composite.ro.ase.cts.main;

import Composite.ro.ase.cts.clase.CompositeDoll;
import Composite.ro.ase.cts.clase.Matrioska;
import Composite.ro.ase.cts.clase.SingleDoll;

public class Main {
    public static void main(String[] args) {
        Matrioska matrioskaMare=new CompositeDoll("verde", "mare");
        Matrioska matrioskaMedie=new CompositeDoll("rosie", "medie");
        Matrioska matrioskaMica=new SingleDoll("albastra", 10.0f);

        ((CompositeDoll) matrioskaMare).adaugaMatrioska(matrioskaMedie);
        ((CompositeDoll) matrioskaMedie).adaugaMatrioska(matrioskaMica);

        matrioskaMare.afiseazaDetaliiMatrioska();
//        matrioskaMedie.afiseazaDetaliiMatrioska();
    }
}
