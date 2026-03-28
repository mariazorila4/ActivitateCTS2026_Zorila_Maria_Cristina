package FactoryMethod.Spital.ro.ase.cts.main;

import FactoryMethod.Spital.ro.ase.cts.clase.PersonalMedical;
import FactoryMethod.Spital.ro.ase.cts.clase.PersonalSpital;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalMedical;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalNonMedical;
import FactoryMethod.Spital.ro.ase.cts.fabrici.FabricaPersonalMedical;
import FactoryMethod.Spital.ro.ase.cts.fabrici.FabricaPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalMedical fabricaPersonalMedical=new FabricaPersonalMedical();
        FabricaPersonalNonMedical fabricaPersonalNonMedical=new FabricaPersonalNonMedical();

        PersonalSpital asistent= fabricaPersonalMedical.getPersonalMedical(TipPersonalMedical.ASISTENT, "Popescu Monica", "cardiologie", 12);
        PersonalSpital medic=fabricaPersonalMedical.getPersonalMedical(TipPersonalMedical.MEDIC, "Roman Alina", "endocrinologie", 20);
        PersonalSpital brancardier= fabricaPersonalMedical.getPersonalMedical(TipPersonalMedical.BRANCARDIER, "Ionescu Andrei", "neurologie", 6);

        PersonalSpital secretar= fabricaPersonalNonMedical.getPersonalNonMedical(TipPersonalNonMedical.SECRETAR, "Chiran Alessia", "secretariat", 4);
        PersonalSpital registrator= fabricaPersonalNonMedical.getPersonalNonMedical(TipPersonalNonMedical.REGISTRATOR, "Serban Andreea", "contabilitate", 8);

        asistent.afiseazaDescriere();
        medic.afiseazaDescriere();
        brancardier.afiseazaDescriere();

        secretar.afiseazaDescriere();
        registrator.afiseazaDescriere();
    }
}
