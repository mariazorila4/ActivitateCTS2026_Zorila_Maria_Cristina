package FactoryMethod.Spital.ro.ase.cts.clase;

public class Medic extends PersonalMedical{
    public Medic(String nume, String sectiune, int aniVechime) {
        super(nume, sectiune, aniVechime);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sectiune='").append(sectiune).append('\'');
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');

        System.out.println(sb);
    }
}
