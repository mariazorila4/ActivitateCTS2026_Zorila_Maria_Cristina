package Builder.Arta.ro.ase.cts.clase;

public class RamaPersonalizata {
    private String tipLemn;
    private boolean geamProtectie;
    private boolean gravura;
    private boolean sistemSpecialPrindere;

    private RamaPersonalizata(String tipLemn, boolean geamProtectie, boolean gravura, boolean sistemSpecialPrindere) {
        this.tipLemn = tipLemn;
        this.geamProtectie = geamProtectie;
        this.gravura = gravura;
        this.sistemSpecialPrindere = sistemSpecialPrindere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RamaPersonalizata{");
        sb.append("tipLemn='").append(tipLemn).append('\'');
        sb.append(", geamProtectie=").append(geamProtectie);
        sb.append(", gravura=").append(gravura);
        sb.append(", sistemSpecialPrindere=").append(sistemSpecialPrindere);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder implements AbstractBuilder{
        private String tipLemn;
        private boolean geamProtectie;
        private boolean gravura;
        private boolean sistemSpecialPrindere;

        public Builder(String tipLemn, boolean geamProtectie, boolean gravura, boolean sistemSpecialPrindere) {
            this.tipLemn = tipLemn;
            this.geamProtectie = geamProtectie;
            this.gravura = gravura;
            this.sistemSpecialPrindere = sistemSpecialPrindere;
        }

        public Builder setTipLemn(String lemn){
            this.tipLemn=lemn;
            return this;
        }

        public Builder setGeamProtectie(boolean areGeam){
            this.geamProtectie=areGeam;
            return this;
        }

        public Builder setGravura(boolean areGravura){
            this.gravura=areGravura;
            return this;
        }

        public Builder setSistemSpecialPrindere(boolean areSistem){
            this.sistemSpecialPrindere=areSistem;
            return this;
        }

        @Override
        public RamaPersonalizata build() {
            return new RamaPersonalizata(tipLemn, geamProtectie, gravura, sistemSpecialPrindere);
        }
    }
}
