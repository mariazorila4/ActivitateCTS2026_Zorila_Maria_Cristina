package ChainOfResponsability.ro.ase.cts.clase;

public class MagazinTorturi extends VanzatorDulciuri{
    public void setHandler(VanzatorDulciuri succesor){
        this.succesor=succesor;
    }

    @Override
    public String recomandaMagazinDulciuri(int monede) {
        if(monede<20){
            return "Magazin torturi";
        }
        return super.succesor.recomandaMagazinDulciuri(monede);
    }
}
