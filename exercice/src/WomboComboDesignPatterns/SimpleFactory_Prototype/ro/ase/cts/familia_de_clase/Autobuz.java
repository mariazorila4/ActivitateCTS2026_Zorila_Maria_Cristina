package WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.familia_de_clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(String nrInmatriculare, int nrRoti, int nrLocuri) {
        super(nrInmatriculare, nrRoti, nrLocuri);
    }

    public Autobuz() {
        super();
    }

    @Override
    public MijlocTransport clone() {
        MijlocTransport autobuz=new Autobuz();
        autobuz.nrInmatriculare=nrInmatriculare;
        autobuz.nrRoti=nrRoti;
        autobuz.nrLocuri=nrLocuri;

        return autobuz;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');

        System.out.println(sb);
    }
}
