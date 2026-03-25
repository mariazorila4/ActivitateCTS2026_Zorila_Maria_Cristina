package Singleton.MiauCafe.ro.ase.cts.clasa;

public class ManagerSuprem {
    private String numeMiauManager;
    private String stareSpirit;
    private int numarRecompensePrimite;
    private static ManagerSuprem instanta=null;

    private ManagerSuprem(String numeMiauManager, String stareSpirit, int numarRecompensePrimite) {
        this.numeMiauManager = numeMiauManager;
        this.stareSpirit = stareSpirit;
        this.numarRecompensePrimite = numarRecompensePrimite;
    }

    public static synchronized ManagerSuprem getInstance(String numeMiauManager, String stareSpirit, int numarRecompensePrimite){
        if(instanta==null){
            instanta=new ManagerSuprem(numeMiauManager, stareSpirit, numarRecompensePrimite);
        }

        return instanta;
    }

    public void onoreazaManagerulSuprem(){
        this.numarRecompensePrimite++;
        if(this.numarRecompensePrimite>10){
            this.stareSpirit="are chef de somn";
           StringBuilder sb=new StringBuilder("MiauManagerul ")
                   .append(this.numeMiauManager).append(" a primit prea multe recompense si ")
                   .append(this.stareSpirit);
            System.out.println(sb);
        }else if(this.numarRecompensePrimite==0){
            this.stareSpirit="este mofturoasa";
            StringBuilder sb=new StringBuilder("MiauManagerul ")
                    .append(this.numeMiauManager).append(" nu a primit recompense si ")
                    .append(this.stareSpirit);
            System.out.println(sb);
        }else{
            this.stareSpirit="este fericita";
            StringBuilder sb=new StringBuilder("MiauManagerul ")
                    .append(this.numeMiauManager).append(" a primit recompense indeajuns si ")
                    .append(this.stareSpirit);
            System.out.println(sb);
        }
    }

    public void afiseazaInfoManagerSuprem(){
        StringBuilder sb = new StringBuilder("ManagerSuprem{");
        sb.append("numeMiauManager='").append(numeMiauManager).append('\'');
        sb.append(", stareSpirit='").append(stareSpirit).append('\'');
        sb.append(", numarRecompensePrimite=").append(numarRecompensePrimite);
        sb.append('}');

        System.out.println(sb);
    }
}
