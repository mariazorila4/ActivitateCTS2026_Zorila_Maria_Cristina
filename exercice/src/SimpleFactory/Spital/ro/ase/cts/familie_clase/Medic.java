package SimpleFactory.Spital.ro.ase.cts.familie_clase;

public class Medic extends PersonalSpital{
    public Medic(String nume, String sectiune, int aniVechime) {
        super(nume, sectiune, aniVechime);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sectiune='").append(sectiune).append('\'');
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');

        System.out.println(sb);
    }
}
