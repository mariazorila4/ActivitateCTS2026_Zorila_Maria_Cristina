package cts.decorator;

import cts.clase.NotaDePlata;

public class NotaDePlataPrintatNouAn extends NotaDePlataDecorator{
    private String data;

    public NotaDePlataPrintatNouAn(NotaDePlata notaDePlata, String data) {
        super(notaDePlata);
        this.data=data;
    }

    @Override
    public void printeazaFelicitare() {
        this.printeazaNotaDePlata();
        System.out.println("Va doresc un an nou fericit");
    }
}
