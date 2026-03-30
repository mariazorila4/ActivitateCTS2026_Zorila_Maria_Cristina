package Builder.Transport.ro.ase.cts.v2_shallow_builder.clase;

public class AutobuzLinieBuilder implements AbstractBuilder{
    private AutobuzLinie autobuzLinie;

    public AutobuzLinieBuilder(String nume) {
        this.autobuzLinie = new AutobuzLinie("Volkswagen", nume, false, false);
    }

    public AutobuzLinieBuilder setModel(String modelNou){
        autobuzLinie.model=modelNou;
        return this;
    }

    public AutobuzLinieBuilder setNumeSofer(String nume){
        autobuzLinie.numeSofer=nume;
        return this;
    }

    public AutobuzLinieBuilder setOprireCapatLinie(boolean areOprire){
        autobuzLinie.oprireCapatLinie=areOprire;
        return this;
    }

    public AutobuzLinieBuilder setUsiAutomate(boolean areUsi){
        autobuzLinie.oprireCapatLinie=areUsi;
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }
}
