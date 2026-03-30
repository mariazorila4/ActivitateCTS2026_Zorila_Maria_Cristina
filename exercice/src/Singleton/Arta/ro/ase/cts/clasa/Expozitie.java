package Singleton.Arta.ro.ase.cts.clasa;

public class Expozitie {
    private String numeExpozitie;
    private int nrTablouriSpatiuDisponibil;
    private int nrTablouriExpuse;
    private static Expozitie instance=null;

    private Expozitie(String numeExpozitie, int nrTablouriSpatiuDisponibil, int nrTablouriExpuse) {
        this.numeExpozitie = numeExpozitie;
        this.nrTablouriSpatiuDisponibil = nrTablouriSpatiuDisponibil;
        this.nrTablouriExpuse = nrTablouriExpuse;
    }

    public static synchronized Expozitie getInstance(String numeExpozitie, int nrTablouriSpatiuDisponibil, int nrTablouriExpuse){
        if(instance==null){
            instance=new Expozitie(numeExpozitie, nrTablouriSpatiuDisponibil, nrTablouriExpuse);
        }
        return instance;
    }

    public void expuneTablou(String numeArtist, String numeTablou){
        if(this.nrTablouriExpuse<this.nrTablouriSpatiuDisponibil){
            System.out.println("Tabloul "+numeTablou+", realizat de "+numeArtist+", a fost expus cu succes!");
            this.nrTablouriExpuse++;
        }else{
            System.out.println("Nu mai exista spatiu pt tabloul creat de artistul plastic "+numeArtist);
        }
    }

    public void afiseazaDetalii(){
        StringBuilder sb = new StringBuilder("Expozitie{");
        sb.append("numeExpozitie='").append(numeExpozitie).append('\'');
        sb.append(", nrTablouriSpatiuDisponibil=").append(nrTablouriSpatiuDisponibil);
        sb.append(", nrTablouriExpuse=").append(nrTablouriExpuse);
        sb.append('}');

        System.out.println(sb);
    }
}
