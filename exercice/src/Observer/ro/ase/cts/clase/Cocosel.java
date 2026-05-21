package Observer.ro.ase.cts.clase;

public class Cocosel extends GestionareAbonati{
    public Cocosel(String ora) {
        super(ora);
    }

    @Override
    public void rasareSoarele() {
        System.out.println("Cocosul canta cucurigu!");
        super.notificarePuiAnimal(this.ora);
    }
}
