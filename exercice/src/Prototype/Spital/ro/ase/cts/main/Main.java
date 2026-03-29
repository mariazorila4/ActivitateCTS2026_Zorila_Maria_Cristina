package Prototype.Spital.ro.ase.cts.main;

import Prototype.Spital.ro.ase.cts.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta rez1=new Reteta("Paracetamol", "paracetamol", "povidona", 500, 30);
        Reteta rez2=(Reteta) rez1.clone();

        ((Reteta)rez2).setNumeMedicament("Ibuprofen");
        ((Reteta)rez2).setNumeSolutieBaza("ibuprofen");
        ((Reteta)rez2).setCantitateSolutieBaza(400);
        ((Reteta)rez2).setNumeSolutieSecundara("crospovidona");
        ((Reteta)rez2).setCantitateSolutieSecundara(200);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
