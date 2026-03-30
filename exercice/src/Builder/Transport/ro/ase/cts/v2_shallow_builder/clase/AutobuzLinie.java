package Builder.Transport.ro.ase.cts.v2_shallow_builder.clase;

public class AutobuzLinie {
    protected String model;
    protected String numeSofer;
    protected boolean oprireCapatLinie;
    protected boolean usiAutomate;

    public AutobuzLinie(String model, String numeSofer, boolean oprireCapatLinie, boolean usiAutomate) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.oprireCapatLinie = oprireCapatLinie;
        this.usiAutomate = usiAutomate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setOprireCapatLinie(boolean oprireCapatLinie) {
        this.oprireCapatLinie = oprireCapatLinie;
    }

    public void setUsiAutomate(boolean usiAutomate) {
        this.usiAutomate = usiAutomate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", oprireCapatLinie=").append(oprireCapatLinie);
        sb.append(", usiAutomate=").append(usiAutomate);
        sb.append('}');
        return sb.toString();
    }
}
