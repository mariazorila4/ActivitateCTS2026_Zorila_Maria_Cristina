package Observer.ro.ase.cts.clase;

public class AlarmaAbonat implements AlarmaObserver{
    private String numeAbonat;

    public AlarmaAbonat(String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }

    @Override
    public void primesteAlarmaDeDimineata(String ora) {
        System.out.println(this.numeAbonat+" s-a trezit! Buna dimineata! Este ora "+ora+".");
    }
}
