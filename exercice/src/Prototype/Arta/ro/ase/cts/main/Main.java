package Prototype.Arta.ro.ase.cts.main;

import Prototype.Arta.ro.ase.cts.clase.Sculptura;

public class Main {
    public static void main(String[] args) {
        Sculptura sculptura1=new Sculptura("vaza", "ceramica", "mov", 20.0f, 20.0f, 40.0f);
        Sculptura sculptura2=(Sculptura) sculptura1.clone();
        ((Sculptura)sculptura2).setCuloare("albastra");

        System.out.println(sculptura1.toString());
        System.out.println(sculptura2.toString());
    }
}
