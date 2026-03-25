package Singleton.Scoala.ro.ase.cts.clasa;

public class CatalogElectronic {
    private String numeScoala;
    private int numarClase;
    private String caleServer;
    private static CatalogElectronic instanta=null;

    private CatalogElectronic(String numeScoala, int numarClase, String caleServer) {
        this.numeScoala = numeScoala;
        this.numarClase = numarClase;
        this.caleServer = caleServer;
    }

    public static synchronized CatalogElectronic getInstance(String numeScoala, int numarClase, String caleServer){
        if(instanta==null){
            instanta=new CatalogElectronic(numeScoala, numarClase, caleServer);
        }

        return instanta;
    }

    public void inregistreazaElev(String numeElev, String numeClasa){
        StringBuilder sb=new StringBuilder("Elevul ");
        sb.append(numeElev).append(" este inregistrat in catalog in clasa ")
                .append(numeClasa).append(" la scoala ")
                .append(this.numeScoala);

        System.out.println(sb);
    }

    public void afiseazaDetaliiCatalog(){
        StringBuilder sb = new StringBuilder("CatalogElectronic{");
        sb.append("numeScoala='").append(numeScoala).append('\'');
        sb.append(", numarClase=").append(numarClase);
        sb.append(", caleServer='").append(caleServer).append('\'');
        sb.append('}');

        System.out.println(sb);
    }
}
