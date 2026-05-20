package Strategy.ro.ase.cts.clase;

public class MersLaPas implements IWalkStrategy{
    @Override
    public void executaMers() {
        System.out.println("Catelusul va merge la pas pe asfalt");
    }
}
