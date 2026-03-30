package FactoryMethod.Arta.ro.ase.cts.familia_de_clase;

public class SculpturaMarmura extends Sculptura{
    public SculpturaMarmura(String numeSculptor, String titluSculptura, float pret) {
        super(numeSculptor, titluSculptura, pret);
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("SculpturaMarmura{");
        sb.append("numeSculptor='").append(numeSculptor).append('\'');
        sb.append(", titluSculptura='").append(titluSculptura).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');

        System.out.println(sb);
    }
}
