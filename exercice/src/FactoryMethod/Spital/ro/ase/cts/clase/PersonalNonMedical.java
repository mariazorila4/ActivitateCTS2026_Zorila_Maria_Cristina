package FactoryMethod.Spital.ro.ase.cts.clase;

public abstract class PersonalNonMedical implements PersonalSpital{
    protected String nume;
    protected String departament;
    protected int aniVechime;

    public PersonalNonMedical(String nume, String departament, int aniVechime) {
        this.nume = nume;
        this.departament = departament;
        this.aniVechime = aniVechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", departament='").append(departament).append('\'');
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');
        return sb.toString();
    }
}
