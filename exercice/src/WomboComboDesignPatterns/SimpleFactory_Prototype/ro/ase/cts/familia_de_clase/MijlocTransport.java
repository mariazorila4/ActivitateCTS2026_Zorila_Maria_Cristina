package WomboComboDesignPatterns.SimpleFactory_Prototype.ro.ase.cts.familia_de_clase;

public abstract class MijlocTransport {
    protected String nrInmatriculare;
    protected int nrRoti;
    protected int nrLocuri;

    public MijlocTransport(String nrInmatriculare, int nrRoti, int nrLocuri) {
        if(nrInmatriculare.length()==8){
            this.nrInmatriculare = nrInmatriculare;
        }else{
            this.nrInmatriculare="IF123456";
        }

        if(nrRoti>=4&&nrRoti<=20){
            this.nrRoti = nrRoti;
        }else{
            this.nrRoti=4;
        }

        if(nrLocuri>=16&&nrLocuri<=200){
            this.nrLocuri = nrLocuri;
        }else{
            this.nrLocuri=16;
        }
    }

    public MijlocTransport(){}

    public void setNrRoti(int nrRoti){
        if(nrRoti>=4&&nrRoti<=20){
            this.nrRoti = nrRoti;
        }else{
            this.nrRoti=4;
        }
    }

    public void setNrLocuri(int nrLocuri){
        if(nrLocuri>=16&&nrLocuri<=200){
            this.nrLocuri = nrLocuri;
        }else{
            this.nrLocuri=16;
        }
    }

    public abstract MijlocTransport clone();
    public abstract void afiseazaDetalii();
}
