package ChainOfResponsability.ro.ase.cts.clase;

public abstract class VanzatorDulciuri {
    protected VanzatorDulciuri succesor;

    public VanzatorDulciuri() {
        this.succesor = null;
    }

    public void setHandler(VanzatorDulciuri succesor){
        this.succesor=succesor;
    }

    public abstract String recomandaMagazinDulciuri(int monede);
}
