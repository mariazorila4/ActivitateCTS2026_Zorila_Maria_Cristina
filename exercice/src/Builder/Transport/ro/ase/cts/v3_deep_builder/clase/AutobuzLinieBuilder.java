package Builder.Transport.ro.ase.cts.v3_deep_builder.clase;

public class AutobuzLinieBuilder implements AbstractBuilder{
    private String model;
    private String numeSofer;
    private boolean oprireCapatLinie;
    private boolean usiAutomate;

    public AutobuzLinieBuilder(String model, String numeSofer, boolean oprireCapatLinie, boolean usiAutomate) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.oprireCapatLinie = oprireCapatLinie;
        this.usiAutomate = usiAutomate;
    }

    public AutobuzLinieBuilder setOprireCapatLinie(boolean oprireCapatLinie){
        this.oprireCapatLinie=oprireCapatLinie;
        return this;
    }

    public AutobuzLinieBuilder setUsiAutomate(boolean usiAutomate){
        this.usiAutomate=usiAutomate;
        return this;
    }

    @Override
    public AutobuzLinie build(String nume) {
        AutobuzLinie autobuzLinie=new AutobuzLinie(this.model, nume, this.oprireCapatLinie, this.usiAutomate);
        return autobuzLinie;
    }
}
