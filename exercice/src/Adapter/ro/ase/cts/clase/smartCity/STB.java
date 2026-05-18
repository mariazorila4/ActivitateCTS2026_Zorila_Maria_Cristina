package Adapter.ro.ase.cts.clase.smartCity;

public class STB {
    private String idBilet;

    public STB(String idBilet) {
        this.idBilet = idBilet;
    }

    public void checkTicketScanner(){
        System.out.println("Biletul cu id "+this.idBilet+" a fost scanat");
    }

}
