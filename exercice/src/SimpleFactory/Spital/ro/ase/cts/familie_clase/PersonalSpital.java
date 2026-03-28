package SimpleFactory.Spital.ro.ase.cts.familie_clase;

public abstract class PersonalSpital {
    protected String nume;
    protected String sectiune;
    protected int aniVechime;

    public PersonalSpital(String nume, String sectiune, int aniVechime) {
        this.nume = nume;
        this.sectiune = sectiune;
        this.aniVechime = aniVechime;
    }

    public abstract void afiseazaDescriere();
}
