package Builder.Transport.ro.ase.cts.v1_inner_class.clase;

public class AutobuzLinie {
    private String model;
    private String numeSofer;
    private boolean oprireCapatLinie;
    private boolean usiAutomate;

    private AutobuzLinie(String model, String numeSofer, boolean oprireCapatLinie, boolean usiAutomate) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.oprireCapatLinie = oprireCapatLinie;
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

    public static class AutobuzLinieBuilder implements AbstractBuilder{
        private String model;
        private String numeSofer;
        private boolean oprireCapatLinie;
        private boolean usiAutomate;

        public AutobuzLinieBuilder(String model, String numeSofer){
            this.model=model;
            this.numeSofer=numeSofer;
        }

        public AutobuzLinieBuilder setModel(String modelAutobuz){
            this.model=modelAutobuz;
            return this;
        }

        public AutobuzLinieBuilder setNumeSofer(String nume){
            this.numeSofer=nume;
            return this;
        }

        public AutobuzLinieBuilder setOprireCapatLinie(boolean areOprireCapatLinie){
            this.oprireCapatLinie=areOprireCapatLinie;
            return this;
        }

        public AutobuzLinieBuilder setUsiAutomate(boolean areUsiAutomate){
            this.usiAutomate=areUsiAutomate;
            return this;
        }

        @Override
        public AutobuzLinie build() {
            return new AutobuzLinie(model, numeSofer, oprireCapatLinie, usiAutomate);
        }
    }
}
