package FactoryMethod.Transport.ro.ase.cts.clase;

public abstract class TransportTerestru implements MijlocTransport{
    protected String nrInmatriculare;
    protected int nrRoti;

    public TransportTerestru(String nrInmatriculare, int nrRoti) {
        this.nrInmatriculare = nrInmatriculare;
        this.nrRoti = nrRoti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransportTerestru{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append('}');
        return sb.toString();
    }
}
