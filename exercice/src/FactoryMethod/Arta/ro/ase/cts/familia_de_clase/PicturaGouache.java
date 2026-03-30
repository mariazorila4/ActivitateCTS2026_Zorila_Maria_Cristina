package FactoryMethod.Arta.ro.ase.cts.familia_de_clase;

public class PicturaGouache extends Pictura{
    public PicturaGouache(String numeArtist, String titluTablou, float pret) {
        super(numeArtist, titluTablou, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("PicturaGouache{");
        sb.append("numeArtist='").append(numeArtist).append('\'');
        sb.append(", titluTablou='").append(titluTablou).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');

        System.out.println(sb);
    }
}
