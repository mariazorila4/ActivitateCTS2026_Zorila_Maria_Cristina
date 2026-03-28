package FactoryMethod.Spital.ro.ase.cts.fabrici;

import FactoryMethod.Spital.ro.ase.cts.clase.PersonalSpital;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalMedical;
import FactoryMethod.Spital.ro.ase.cts.enums.TipPersonalNonMedical;

public interface FabricaPersonalSpital {
    public PersonalSpital getPersonalMedical(TipPersonalMedical tip, String nume, String sectiune, int aniVechime);
    public PersonalSpital getPersonalNonMedical(TipPersonalNonMedical tip, String nume, String departament, int aniVechime);
}
