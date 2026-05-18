package Adapter.ro.ase.cts.clase.stb;

public class STB {
    private String idBilet;

    public STB(String idBilet) {
        this.idBilet = idBilet;
    }

    public void valideazaBilet(){
        if(detineBilet()){
            System.out.println("Biletul cu id:"+this.idBilet+" a fost validat");
        }else{
            System.out.println("Nu a achizitionat bilet");
        }
    }

    public boolean detineBilet(){
        return this.idBilet.length()>5;
    }

    public String getIdBilet() {
        return idBilet;
    }
}
