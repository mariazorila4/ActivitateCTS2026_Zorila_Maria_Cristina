package WomboComboDesignPatterns.Singleton_Builder.ro.ase.cts.clase;

public class RegistruComenzi {
    private String numeCentru;
    private int nrMaximComenzi;
    private int nrComenziPreluate;
    private static RegistruComenzi instance=null;

    public RegistruComenzi(String numeCentru, int nrMaximComenzi, int nrComenziPreluate) {
        this.numeCentru = numeCentru;
        this.nrMaximComenzi = nrMaximComenzi;
        this.nrComenziPreluate = nrComenziPreluate;
    }

    public static synchronized RegistruComenzi getInstance(String numeCentru, int nrMaximComenzi, int nrComenziPreluate){
        if(instance==null){
            instance=new RegistruComenzi(numeCentru,nrMaximComenzi,nrComenziPreluate);
        }
        return instance;
    }

    public void preiaComanda(String numeClient, Calculator pc){
        if(this.nrComenziPreluate<this.nrMaximComenzi){
            System.out.println("Comanda acceptata pentru "+numeClient+" : "+pc.toString());
            this.nrComenziPreluate++;
        }else{
            System.out.println("Capacitate maxima atinsa pt centrul "+this.numeCentru+"! Nu se poate prelua comanda clientului "+numeClient);
        }
    }

    public void afiseazDetalii(){
        StringBuilder sb = new StringBuilder("RegistruComenzi{");
        sb.append("numeCentru='").append(numeCentru).append('\'');
        sb.append(", nrMaximComenzi=").append(nrMaximComenzi);
        sb.append(", nrComenziPreluate=").append(nrComenziPreluate);
        sb.append('}');

        System.out.println(sb);
    }
}
