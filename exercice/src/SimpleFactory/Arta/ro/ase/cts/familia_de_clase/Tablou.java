package SimpleFactory.Arta.ro.ase.cts.familia_de_clase;

public abstract class Tablou {
    protected String numeArtist;
    protected String titluTablou;
    protected float pret;

    public Tablou(String numeArtist, String titluTablou, float pret) {
        this.numeArtist = numeArtist;
        this.titluTablou = titluTablou;
        this.pret = pret;
    }

    public abstract void afiseazaDetalii();
}
