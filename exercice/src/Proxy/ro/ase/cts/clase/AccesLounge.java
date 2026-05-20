package Proxy.ro.ase.cts.clase;

public class AccesLounge implements AccesPetrecere{
    private String numeLounge;
    private int capacitateMaxima;
    private int nrPisiciPrezente;

    public AccesLounge(String numeLounge, int capacitateMaxima, int nrPisiciPrezente) {
        this.numeLounge = numeLounge;
        this.capacitateMaxima = capacitateMaxima;
        this.nrPisiciPrezente = nrPisiciPrezente;
    }

    @Override
    public void permiteAccesul(Pisica p) {
        this.nrPisiciPrezente++;
        if(this.nrPisiciPrezente<this.capacitateMaxima){
            System.out.println("Pisica "+p.getNumePisica()+" a primit accesul pentru a intra la petrecerea din "+this.numeLounge);
            System.out.println("Grad de ocupare: "+nrPisiciPrezente+"/"+capacitateMaxima);
        }else{
            System.out.println("Nu mai sunt locuri disponibile");
        }
    }

}
