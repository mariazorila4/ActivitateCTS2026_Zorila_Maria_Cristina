package Prototype.Spital.ro.ase.cts.clase;

public class Reteta implements RetetaAbstract{
    private String numeMedicament;
    private String numeSolutieBaza;
    private String numeSolutieSecundara;
    private float cantitateSolutieBaza;
    private float cantitateSolutieSecundara;

    public Reteta(String numeMedicament, String numeSolutieBaza, String numeSolutieSecundara, float cantitateSolutieBaza, float cantitateSolutieSecundara) {
        if(numeMedicament.length()>=3){
            this.numeMedicament=numeMedicament;
        }else{
            this.numeMedicament="medicament";
        }

        if(numeSolutieBaza.length()>=3){
            this.numeSolutieBaza = numeSolutieBaza;
        }else{
            this.numeSolutieBaza="solutie de baza";
        }

        if(numeSolutieSecundara.length()>=3){
            this.numeSolutieSecundara=numeSolutieSecundara;
        }else{
            this.numeSolutieSecundara="solutie secundara";
        }

        if(cantitateSolutieBaza>=10){
            this.cantitateSolutieBaza = cantitateSolutieBaza;
        }else{
            this.cantitateSolutieBaza=100f;
        }

        if(cantitateSolutieSecundara>=5){
            this.cantitateSolutieSecundara = cantitateSolutieSecundara;
        }else{
            this.cantitateSolutieSecundara=50f;
        }

    }

    public Reteta(){}

    @Override
    public RetetaAbstract clone() {
        Reteta retetaNoua=new Reteta();
        retetaNoua.numeMedicament=numeMedicament;
        retetaNoua.numeSolutieBaza=numeSolutieBaza;
        retetaNoua.numeSolutieSecundara=numeSolutieSecundara;
        retetaNoua.cantitateSolutieBaza=cantitateSolutieBaza;
        retetaNoua.cantitateSolutieSecundara=cantitateSolutieSecundara;

        return retetaNoua;
    }

    public void setNumeMedicament(String numeMedicament){
        if(numeMedicament.length()>=3){
            this.numeMedicament=numeMedicament;
        }else{
            this.numeMedicament="medicament";
        }
    }

    public void setNumeSolutieBaza(String numeSolutieBaza){
        if(numeSolutieBaza.length()>=3){
            this.numeSolutieBaza = numeSolutieBaza;
        }else{
            this.numeSolutieBaza="solutie de baza";
        }
    }

    public void setNumeSolutieSecundara(String numeSolutieSecundara){
        if(numeSolutieSecundara.length()>=3){
            this.numeSolutieSecundara=numeSolutieSecundara;
        }else{
            this.numeSolutieSecundara="solutie secundara";
        }
    }

    public void setCantitateSolutieBaza(float cantitateSolutieBaza){
        if(cantitateSolutieBaza>=10){
            this.cantitateSolutieBaza = cantitateSolutieBaza;
        }else{
            this.cantitateSolutieBaza=100f;
        }
    }

    public void setCantitateSolutieSecundara(float cantitateSolutieSecundara){
        if(cantitateSolutieSecundara>=5){
            this.cantitateSolutieSecundara = cantitateSolutieSecundara;
        }else{
            this.cantitateSolutieSecundara=50f;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", numeSolutieBaza='").append(numeSolutieBaza).append('\'');
        sb.append(", numeSolutieSecundara='").append(numeSolutieSecundara).append('\'');
        sb.append(", cantitateSolutieBaza=").append(cantitateSolutieBaza);
        sb.append(", cantitateSolutieSecundara=").append(cantitateSolutieSecundara);
        sb.append('}');
        return sb.toString();
    }
}
