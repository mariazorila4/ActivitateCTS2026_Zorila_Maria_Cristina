package Singleton.Spital.ro.ase.cts.clasa;

public class LogCenter {
    private String numeFisier;
    private int nrMesajeInregistrate;
    private String gradSecuritate;
    private static LogCenter instance=null;

    private LogCenter(String numeFisier, int nrMesajeInregistrate, String gradSecuritate) {
        this.numeFisier = numeFisier;
        this.nrMesajeInregistrate = nrMesajeInregistrate;
        this.gradSecuritate = gradSecuritate;
    }

    public static synchronized LogCenter getInstance(String numeFisier, int nrMesajeInregistrate, String gradSecuritate){
        if(instance==null){
            instance=new LogCenter(numeFisier, nrMesajeInregistrate, gradSecuritate);
        }
        return instance;
    }

    public void securizeazaFisier(String nouGradSecuritate){
        if(!this.gradSecuritate.equals(nouGradSecuritate)){
            System.out.println("Gradul de securitate al fisierului a fost actualizat din "+this.gradSecuritate+" in "+nouGradSecuritate);
            this.gradSecuritate=nouGradSecuritate;
        }else{
            System.out.println("Nivelul de securitate al fisierului este "+gradSecuritate);
        }
    }

    public void afiseazaDetaliiLogger(){
        StringBuilder sb = new StringBuilder("LogCenter{");
        sb.append("numeFisier='").append(this.numeFisier).append('\'');
        sb.append(", nrMesajeInregistrate=").append(this.nrMesajeInregistrate);
        sb.append(", gradSecuritate='").append(this.gradSecuritate).append('\'');
        sb.append('}');

        System.out.println(sb);
    }
}
