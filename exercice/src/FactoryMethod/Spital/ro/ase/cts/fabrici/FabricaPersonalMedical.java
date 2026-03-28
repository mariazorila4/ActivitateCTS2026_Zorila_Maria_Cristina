package FactoryMethod.Spital.ro.ase.cts.fabrici;

import FactoryMethod.Spital.ro.ase.cts.clase.Asistent;
import FactoryMethod.Spital.ro.ase.cts.clase.Brancardier;
import FactoryMethod.Spital.ro.ase.cts.clase.Medic;
import FactoryMethod.Spital.ro.ase.cts.clase.PersonalSpital;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalMedical;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalNonMedical;

public class FabricaPersonalMedical implements FabricaPersonalSpital{
    @Override
    public PersonalSpital getPersonalMedical(TipPersonalMedical tip, String nume, String sectiune, int aniVechime) {
        if(tip==TipPersonalMedical.ASISTENT){
            return new Asistent(nume, sectiune, aniVechime);
        }
        if(tip==TipPersonalMedical.MEDIC){
            return new Medic(nume, sectiune, aniVechime);
        }
        if(tip==TipPersonalMedical.BRANCARDIER){
            return new Brancardier(nume, sectiune, aniVechime);
        }
        return null;
    }

    @Override
    public PersonalSpital getPersonalNonMedical(TipPersonalNonMedical tip, String nume, String departament, int aniVechime) {
        return null;
    }
}
