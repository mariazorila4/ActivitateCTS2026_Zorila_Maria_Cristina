package Decorator.ro.ase.cts.clase;

public class Costum implements CostumAbstract{
    private String descriere;
    private float pretFix;

    public Costum(String descriere, float pretFix) {
        this.descriere = descriere;
        this.pretFix = pretFix;
    }

    public String getDescriere() {
        return descriere;
    }

    public Costum setDescriere(String descriere) {
        this.descriere = descriere;
        return this;
    }

    public float getPretFix() {
        return pretFix;
    }

    public Costum setPretFix(float pretFix) {
        this.pretFix = pretFix;
        return this;
    }

    @Override
    public void calculeazaPret() {
        System.out.println("Costumul cu componente "+this.descriere+" costa "+this.pretFix);
    }
}
