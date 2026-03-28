package SimpleFactory.Spital.ro.ase.cts.fabrica;

import SimpleFactory.Spital.ro.ase.cts.familie_clase.Asistent;
import SimpleFactory.Spital.ro.ase.cts.familie_clase.Brancardier;
import SimpleFactory.Spital.ro.ase.cts.familie_clase.Medic;
import SimpleFactory.Spital.ro.ase.cts.familie_clase.PersonalSpital;

public class FabricaPersonal {
    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume, String sectiune, int aniVechime) {
        if (tip == TipPersonal.ASISTENT) {
            return new Asistent(nume, sectiune, aniVechime);
        }
        if (tip == TipPersonal.BRANCARDIER) {
            return new Brancardier(nume, sectiune, aniVechime);
        }
        if (tip == TipPersonal.MEDIC) {
            return new Medic(nume, sectiune, aniVechime);
        }
        return null;
    }
}
