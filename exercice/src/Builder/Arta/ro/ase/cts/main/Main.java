package Builder.Arta.ro.ase.cts.main;

import Builder.Arta.ro.ase.cts.clase.AbstractBuilder;
import Builder.Arta.ro.ase.cts.clase.RamaPersonalizata;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new RamaPersonalizata.Builder("stejar", false, false, false);

        ((RamaPersonalizata.Builder)builder).setGeamProtectie(true);

        RamaPersonalizata r1= builder.build();
        System.out.println(r1.toString());
    }
}
