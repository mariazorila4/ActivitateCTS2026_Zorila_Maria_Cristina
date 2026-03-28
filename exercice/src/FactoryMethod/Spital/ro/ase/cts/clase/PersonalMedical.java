package FactoryMethod.Spital.ro.ase.cts.clase;

public abstract class PersonalMedical implements PersonalSpital{
    protected String nume;
    protected String sectiune;
    protected int aniVechime;

    public PersonalMedical(String nume, String sectiune, int aniVechime) {
        this.nume = nume;
        this.sectiune = sectiune;
        this.aniVechime = aniVechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sectiune='").append(sectiune).append('\'');
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');
        return sb.toString();
    }

}
