package FactoryMethod.Spital.ro.ase.cts.clase;

public class Secretar extends PersonalNonMedical{
    public Secretar(String nume, String departament, int aniVechime) {
        super(nume, departament, aniVechime);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", departament='").append(departament).append('\'');
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');

        System.out.println(sb);
    }
}
