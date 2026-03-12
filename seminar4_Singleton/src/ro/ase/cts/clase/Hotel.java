package ro.ase.cts.clase;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;
    private static Hotel instanta=null;

    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int numarCamereOcupate){
        if(instanta==null){
            instanta=new Hotel(numeHotel, numarCamere, numarCamereOcupate);
        }

        return instanta;
    }

    public void rezervaCamera(){
        if(this.numarCamereOcupate<this.numarCamere){
            System.out.println("Rezervarea a fost realizata");
            this.numarCamereOcupate++;
        }else{
            System.out.println("Nu mai sunt camere disponibile");
        }
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder builder=new StringBuilder();
        builder.append("Nume hotel: ").append(this.numeHotel)
                .append("\n Numar camere in total: ").append(this.numarCamere)
                .append("\n Camere ocupate: ").append(this.numarCamereOcupate)
                .append("\n Camere disponibile: ").append(this.numarCamere-this.numarCamereOcupate);

        System.out.println(builder);
    }
}
