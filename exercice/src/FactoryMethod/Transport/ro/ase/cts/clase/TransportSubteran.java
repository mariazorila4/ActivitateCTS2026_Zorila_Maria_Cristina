package FactoryMethod.Transport.ro.ase.cts.clase;

public abstract class TransportSubteran implements MijlocTransport{
    protected String nrInmatriculare;
    protected int nrRoti;
    protected String magistrala;

    public TransportSubteran(String nrInmatriculare, int nrRoti, String magistrala) {
        this.nrInmatriculare = nrInmatriculare;
        this.nrRoti = nrRoti;
        this.magistrala = magistrala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransportSubteran{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append(", magistrala='").append(magistrala).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
