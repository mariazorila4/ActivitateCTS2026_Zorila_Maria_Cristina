package FactoryMethod.Spital.ro.ase.cts.fabrici;

import FactoryMethod.Spital.ro.ase.cts.clase.PersonalSpital;
import FactoryMethod.Spital.ro.ase.cts.clase.Registrator;
import FactoryMethod.Spital.ro.ase.cts.clase.Secretar;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalMedical;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalNonMedical;

public class FabricaPersonalNonMedical implements FabricaPersonalSpital{
    @Override
    public PersonalSpital getPersonalMedical(TipPersonalMedical tip, String nume, String sectiune, int aniVechime) {
        return null;
    }

    @Override
    public PersonalSpital getPersonalNonMedical(TipPersonalNonMedical tip, String nume, String departament, int aniVechime) {
        if(tip==TipPersonalNonMedical.SECRETAR){
            return new Secretar(nume, departament, aniVechime);
        }
        if(tip==TipPersonalNonMedical.REGISTRATOR){
            return new Registrator(nume, departament, aniVechime);
        }
        return null;
    }
}
