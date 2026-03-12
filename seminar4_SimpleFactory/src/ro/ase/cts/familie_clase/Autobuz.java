package ro.ase.cts.familie_clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder=new StringBuilder();
        builder.append("Autobuzul are - Numar roti: ").append(super.numarRoti)
                .append("\n Numar inmatriculare: ").append(super.numarInmatriculare);

        System.out.println(builder.toString());
    }
}
