package cts.decorator;

import cts.clase.NotaDePlata;

public class NotaDePlataPrintatNouAn extends NotaDePlataDecorator{

    public NotaDePlataPrintatNouAn(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare(String felicitare) {

    }
}
