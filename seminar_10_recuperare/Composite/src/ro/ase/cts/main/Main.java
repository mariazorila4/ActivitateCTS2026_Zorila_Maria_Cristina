package ro.ase.cts.main;

import ro.ase.cts.clase.Departament;
import ro.ase.cts.clase.Structura;


public class Main {
    public static void main(String[] args) {
        Structura depSpital=new Departament("Spital");
        Structura depAdministrativ=new Departament("Administrativ");
        Structura depSecretariat=new Departament("Secretariat");
        Structura depManagement=new Departament("Management");

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(depManagement);
        ((Departament) depAdministrativ).adaugaStructura(depSecretariat);

        depSpital.afiseazaDetaliiStructura();

        ((Departament) depSpital).stergeStructura(depManagement);
        ((Departament) depAdministrativ).adaugaStructura(depManagement);
    }
}
