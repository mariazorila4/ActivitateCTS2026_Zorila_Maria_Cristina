package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1=new Rezervare("Gigel", 20, 30, "0789345612");
        Rezervare rez2=(Rezervare) rez1.clone();

        ((Rezervare)rez2).setOraRezervare(10);
        ((Rezervare)rez2).setZiuaRezervarii(20);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
