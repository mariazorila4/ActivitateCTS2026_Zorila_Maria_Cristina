package Proxy.ro.ase.cts.clase;

public class Pisica {
    private String numePisica;
    private boolean areZgarda;
    private boolean areVaccinAnual;

    public Pisica(String numePisica, boolean areZgarda, boolean areVaccinAnual) {
        this.numePisica = numePisica;
        this.areZgarda = areZgarda;
        this.areVaccinAnual = areVaccinAnual;
    }

    public String getNumePisica() {
        return numePisica;
    }

    public boolean isAreZgarda() {
        return areZgarda;
    }

    public boolean isAreVaccinAnual() {
        return areVaccinAnual;
    }
}
