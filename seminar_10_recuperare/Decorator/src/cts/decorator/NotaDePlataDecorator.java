package cts.decorator;

import cts.clase.NotaDePlata;
import cts.clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    protected NotaDePlata notaDePlata;

    public NotaDePlataDecorator(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNotaDePlata() {
        notaDePlata.printeazaNotaDePlata();
        System.out.println("Nota de plata emisa");
    }

    public abstract void printeazaFelicitare(String felicitare);
}
