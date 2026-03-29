package WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.familia_de_clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(String nrInmatriculare, int nrRoti, int nrLocuri) {
        super(nrInmatriculare, nrRoti, nrLocuri);
    }

    public Tramvai() {
        super();
    }

    @Override
    public MijlocTransport clone() {
        MijlocTransport tramvai=new Tramvai();
        tramvai.nrInmatriculare=nrInmatriculare;
        tramvai.nrRoti=nrRoti;
        tramvai.nrLocuri=nrLocuri;

        return tramvai;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');

        System.out.println(sb);
    }
}
