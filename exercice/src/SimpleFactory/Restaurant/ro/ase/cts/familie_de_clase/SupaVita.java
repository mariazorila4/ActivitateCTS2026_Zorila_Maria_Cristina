package SimpleFactory.Restaurant.ro.ase.cts.familie_de_clase;

public class SupaVita extends Supa{
    public SupaVita(int gramaj, float pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("SupaVita{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');

        System.out.println(sb);
    }
}
