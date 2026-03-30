package SimpleFactory.Arta.ro.ase.cts.familia_de_clase;

public class TablouAcrilic extends Tablou{
    public TablouAcrilic(String numeArtist, String titluTablou, float pret) {
        super(numeArtist, titluTablou, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("TablouAcrilic{");
        sb.append("numeArtist='").append(numeArtist).append('\'');
        sb.append(", titluTablou='").append(titluTablou).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');

        System.out.println(sb);
    }
}
