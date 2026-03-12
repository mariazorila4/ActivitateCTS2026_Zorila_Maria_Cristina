package ro.ase.cts.familie_clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder=new StringBuilder();
        builder.append("Troleibuz are - numar roti: ").append(super.numarRoti)
                .append("\n Numar inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder.toString());
    }
}
