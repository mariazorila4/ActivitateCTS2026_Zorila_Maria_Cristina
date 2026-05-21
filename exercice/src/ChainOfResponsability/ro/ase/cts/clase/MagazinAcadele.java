package ChainOfResponsability.ro.ase.cts.clase;

public class MagazinAcadele extends VanzatorDulciuri{
    public void setHandler(VanzatorDulciuri succesor){
        this.succesor=succesor;
    }

    @Override
    public String recomandaMagazinDulciuri(int monede) {
        if(monede<5){
            return "Magazin acadele";
        }
        return super.succesor.recomandaMagazinDulciuri(monede);
    }
}
