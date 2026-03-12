package ro.ase.cts.familie_clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder=new StringBuilder();
        builder.append("Tramvaiul are - numar roti: ").append(super.numarRoti)
                .append("\n Numar inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder.toString());
    }
}
