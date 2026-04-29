package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlata;

public class NotaDePlataPrintatNouAn extends NotaDePlataDecorator{

    public NotaDePlataPrintatNouAn(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare(String felicitare) {

    }
}
