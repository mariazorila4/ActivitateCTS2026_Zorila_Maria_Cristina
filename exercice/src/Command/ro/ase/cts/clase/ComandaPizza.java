package Command.ro.ase.cts.clase;

public class ComandaPizza implements Command{
    private Bucatar bucatar;
    private String pizza;

    public ComandaPizza(Bucatar bucatar, String pizza) {
        this.bucatar = bucatar;
        this.pizza = pizza;
    }

    @Override
    public void executa() {
        bucatar.gatestePizza(this.pizza);
    }
}
