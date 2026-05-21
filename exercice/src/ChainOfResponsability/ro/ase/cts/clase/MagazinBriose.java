package ChainOfResponsability.ro.ase.cts.clase;

public class MagazinBriose extends VanzatorDulciuri{
    public void setHandler(VanzatorDulciuri succesor){
        this.succesor=succesor;
    }

    @Override
    public String recomandaMagazinDulciuri(int monede) {
       if(monede<10){
           return "Magazin de briose";
       }
       return super.succesor.recomandaMagazinDulciuri(monede);
    }
}
