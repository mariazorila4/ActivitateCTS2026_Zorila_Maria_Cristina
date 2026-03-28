package FactoryMethod.Transport.ro.ase.cts.clase;

public class Troleibuz extends TransportTerestru{
    public Troleibuz(String nrInmatriculare, int nrRoti) {
        super(nrInmatriculare, nrRoti);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append('}');

        System.out.println(sb);
    }
}
