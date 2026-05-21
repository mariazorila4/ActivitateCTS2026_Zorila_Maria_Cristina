package Command.ro.ase.cts.clase;

public class Bucatar {
    private String felMancare;

    public Bucatar(String felMancare) {
        this.felMancare = felMancare;
    }

    public void gatestePizza(String felMancare){
        System.out.println("Bucatarul gateste pizza "+felMancare);
    }

    public void gatesteSupa(String felMancare){
        System.out.println("Bucatarul gateste supa de "+felMancare);
    }
}
