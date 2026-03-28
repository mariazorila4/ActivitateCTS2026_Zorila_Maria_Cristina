package SimpleFactory.Restaurant.ro.ase.cts.familie_de_clase;

public abstract class Supa {
    protected int gramaj;
    protected float pret;

    public Supa(int gramaj, float pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public abstract void afiseazaDescriere();
}
