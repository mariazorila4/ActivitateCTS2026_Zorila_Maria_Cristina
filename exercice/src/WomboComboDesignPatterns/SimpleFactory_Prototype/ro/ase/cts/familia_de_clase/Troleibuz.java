package WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.familia_de_clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String nrInmatriculare, int nrRoti, int nrLocuri) {
        super(nrInmatriculare, nrRoti, nrLocuri);
    }

    public Troleibuz() {
        super();
    }

    @Override
    public MijlocTransport clone() {
        MijlocTransport troleibuz=new Troleibuz();
        troleibuz.nrInmatriculare=nrInmatriculare;
        troleibuz.nrRoti=nrRoti;
        troleibuz.nrLocuri=nrLocuri;

        return troleibuz;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');

        System.out.println(sb);
    }
}
