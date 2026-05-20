package Flyweight.ro.ase.cts.clase;

public class Cires implements CiresFlyweight{
    private String specie;
    private String culoareFlori;
    private int codNumeric;

    public Cires(String specie, String culoareFlori, int codNumeric) {
        this.specie = specie;
        this.culoareFlori = culoareFlori;
        this.codNumeric=codNumeric;
    }

    @Override
    public void afiseazaCires(PozitieCires pozitie) {
        StringBuilder sb = new StringBuilder("Cires{");
        sb.append("specie='").append(specie).append('\'');
        sb.append(", culoareFlori='").append(culoareFlori).append('\'');
        sb.append(", codNumeric='").append(codNumeric).append('\'');
        sb.append(", pozitieCires='").append(pozitie).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }
}
