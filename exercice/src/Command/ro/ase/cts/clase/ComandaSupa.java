package Command.ro.ase.cts.clase;

public class ComandaSupa implements Command{
    private Bucatar bucatar;
    private String supa;

    public ComandaSupa(Bucatar bucatar, String supa) {
        this.bucatar = bucatar;
        this.supa = supa;
    }

    @Override
    public void executa() {
        bucatar.gatesteSupa(this.supa);
    }
}
