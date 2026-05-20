package Proxy.ro.ase.cts.clase;

public class Portar implements AccesPetrecere{
    private AccesPetrecere accesPetrecere;

    public Portar(AccesPetrecere accesPetrecere) {
        this.accesPetrecere = accesPetrecere;
    }

    @Override
    public void permiteAccesul(Pisica pisica) {
        if(pisica.isAreZgarda() && pisica.isAreVaccinAnual()){
          this.accesPetrecere.permiteAccesul(pisica);
        }else{
            System.out.println("Pisica "+pisica.getNumePisica()+" nu indeplineste conditiile pentru a intra la petrecere");
        }
    }

}
