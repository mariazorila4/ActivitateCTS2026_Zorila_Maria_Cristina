package Strategy.ro.ase.cts.clase;

public class CatelusRobot{
    private String nume;
    private IWalkStrategy walkStrategy;

    public void setWalkStrategy(IWalkStrategy walkStrategy){
        this.walkStrategy=walkStrategy;
    }

    public CatelusRobot(IWalkStrategy walkStrategy) {
        this.walkStrategy = walkStrategy;
    }

    public CatelusRobot() {
        this.walkStrategy=new MersLaPas();
    }

    public void mers(){
        walkStrategy.executaMers();
    }

    public CatelusRobot(String nume) {
        this.nume = nume;
    }
}
