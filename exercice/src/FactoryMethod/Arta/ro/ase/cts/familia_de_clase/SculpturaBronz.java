package FactoryMethod.Arta.ro.ase.cts.familia_de_clase;

public class SculpturaBronz extends Sculptura{
    public SculpturaBronz(String numeSculptor, String titluSculptura, float pret) {
        super(numeSculptor, titluSculptura, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("SculpturaBronz{");
        sb.append("numeSculptor='").append(numeSculptor).append('\'');
        sb.append(", titluSculptura='").append(titluSculptura).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');

        System.out.println(sb);
    }
}
