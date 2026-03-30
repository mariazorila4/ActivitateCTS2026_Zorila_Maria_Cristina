package FactoryMethod.Arta.ro.ase.cts.familia_de_clase;

public abstract class Sculptura implements Exponat{
    protected String numeSculptor;
    protected String titluSculptura;
    protected float pret;

    public Sculptura(String numeSculptor, String titluSculptura, float pret) {
        this.numeSculptor = numeSculptor;
        this.titluSculptura = titluSculptura;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sculptura{");
        sb.append("numeSculptor='").append(numeSculptor).append('\'');
        sb.append(", titluSculptura='").append(titluSculptura).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
