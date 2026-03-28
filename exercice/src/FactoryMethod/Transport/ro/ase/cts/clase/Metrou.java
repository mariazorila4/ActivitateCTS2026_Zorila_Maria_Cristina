package FactoryMethod.Transport.ro.ase.cts.clase;

public class Metrou extends TransportSubteran{
    public Metrou(String nrInmatriculare, int nrRoti, String magistrala) {
        super(nrInmatriculare, nrRoti, magistrala);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Metrou{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", nrRoti=").append(nrRoti);
        sb.append(", magistrala='").append(magistrala).append('\'');
        sb.append('}');

        System.out.println(sb);
    }
}
