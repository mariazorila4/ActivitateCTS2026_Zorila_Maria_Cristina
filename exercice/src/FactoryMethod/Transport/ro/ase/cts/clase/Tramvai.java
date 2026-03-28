package FactoryMethod.Transport.ro.ase.cts.clase;

public class Tramvai extends TransportTerestru{
    public Tramvai(String nrInmatriculare, int nrRoti) {
        super(nrInmatriculare, nrRoti);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append('}');

        System.out.println(sb);
    }
}
