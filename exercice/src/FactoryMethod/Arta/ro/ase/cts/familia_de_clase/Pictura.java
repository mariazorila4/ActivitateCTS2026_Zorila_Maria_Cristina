package FactoryMethod.Arta.ro.ase.cts.familia_de_clase;

public abstract class Pictura implements Exponat{
    protected String numeArtist;
    protected String titluTablou;
    protected float pret;

    public Pictura(String numeArtist, String titluTablou, float pret) {
        this.numeArtist = numeArtist;
        this.titluTablou = titluTablou;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pictura{");
        sb.append("numeArtist='").append(numeArtist).append('\'');
        sb.append(", titluTablou='").append(titluTablou).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
