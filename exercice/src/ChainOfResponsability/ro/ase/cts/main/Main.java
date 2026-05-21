package ChainOfResponsability.ro.ase.cts.main;

import ChainOfResponsability.ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        VanzatorDulciuri acadele=new MagazinAcadele();
        VanzatorDulciuri briose=new MagazinBriose();
        VanzatorDulciuri torturi=new MagazinTorturi();
        VanzatorDulciuri miere=new MagazinMiere();

        acadele.setHandler(briose);
        briose.setHandler(torturi);
        torturi.setHandler(miere);

        System.out.println(acadele.recomandaMagazinDulciuri(4));
        System.out.println(acadele.recomandaMagazinDulciuri(8));
        System.out.println(acadele.recomandaMagazinDulciuri(16));
        System.out.println(acadele.recomandaMagazinDulciuri(32));
    }
}
