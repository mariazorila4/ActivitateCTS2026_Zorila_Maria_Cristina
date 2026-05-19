package Composite.ro.ase.cts.clase;

public class SingleDoll implements Matrioska{
    private String culoare;
    private float inaltime;

    public SingleDoll(String culoare, float inaltime) {
        this.culoare = culoare;
        this.inaltime = inaltime;
    }

    @Override
    public void afiseazaDetaliiMatrioska() {
        System.out.println("Papusa cea mai mica este de culoare "+this.culoare+" si are "+this.inaltime+" cm");
    }
}
