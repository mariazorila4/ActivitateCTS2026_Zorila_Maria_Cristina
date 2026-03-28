package FactoryMethod.Spital.ro.ase.cts.clase;

public class Registrator extends PersonalNonMedical{
    public Registrator(String nume, String departament, int aniVechime) {
        super(nume, departament, aniVechime);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Registrator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", departament='").append(departament).append('\'');
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');

        System.out.println(sb);
    }
}
