package SimpleFactory.Spital.ro.ase.cts.main;

import SimpleFactory.Spital.ro.ase.cts.fabrica.FabricaPersonal;
import SimpleFactory.Spital.ro.ase.cts.fabrica.TipPersonal;
import SimpleFactory.Spital.ro.ase.cts.familie_clase.PersonalSpital;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabrica=new FabricaPersonal();
        PersonalSpital asistenta= fabrica.getPersonalSpital(TipPersonal.ASISTENT, "Popescu Monica", "cardiologie", 12);
        PersonalSpital medic= fabrica.getPersonalSpital(TipPersonal.MEDIC, "Roman Alina", "endocrinologie", 20);
        PersonalSpital brancardier=fabrica.getPersonalSpital(TipPersonal.BRANCARDIER, "Ionescu Andrei", "neurologie", 6);

        asistenta.afiseazaDescriere();
        medic.afiseazaDescriere();
        brancardier.afiseazaDescriere();
    }
}
