package WomboComboDesignPatterns.Singleton_Builder.ro.ase.cts.clase;

public class Calculator {
    private String procesor;
    private String stocare;
    private boolean alimentareRapida;
    private boolean placaVideoDedicata;
    private int ram;

    private Calculator(String procesor, String stocare, boolean alimentareRapida, boolean placaVideoDedicata, int ram) {
        this.procesor = procesor;
        this.stocare = stocare;
        this.alimentareRapida = alimentareRapida;
        this.placaVideoDedicata = placaVideoDedicata;
        this.ram = ram;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calculator{");
        sb.append("procesor='").append(procesor).append('\'');
        sb.append(", stocare='").append(stocare).append('\'');
        sb.append(", alimentareRapida=").append(alimentareRapida);
        sb.append(", placaVideoDedicata=").append(placaVideoDedicata);
        sb.append(", ram=").append(ram);
        sb.append('}');
        return sb.toString();
    }

    public static class Builder implements AbstractBuilder{
        private String procesor;
        private String stocare;
        private boolean alimentareRapida;
        private boolean placaVideoDedicata;
        private int ram;

        public Builder(String procesor, String stocare) {
            this.procesor = procesor;
            this.stocare = stocare;
        }

        public Builder setProcesor(String procesorNou){
            this.procesor=procesorNou;
            return this;
        }

        public Builder setStocare(String stocareNoua){
            this.stocare=stocareNoua;
            return this;
        }

        public Builder setAlimentareRapida(boolean areAlimentareRapida){
            this.alimentareRapida=areAlimentareRapida;
            return this;
        }

        public Builder setPlacaVideoDedicata(boolean arePlacaVideoDedicata){
            this.placaVideoDedicata=arePlacaVideoDedicata;
            return this;
        }

        public Builder setRam(int ramNou){
            this.ram=ramNou;
            return this;
        }

        @Override
        public Calculator build() {
            return new Calculator(procesor, stocare, alimentareRapida, placaVideoDedicata, ram);
        }
    }
}
