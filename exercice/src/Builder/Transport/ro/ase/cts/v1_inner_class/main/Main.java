package Builder.Transport.ro.ase.cts.v1_inner_class.main;

import Builder.Transport.ro.ase.cts.v1_inner_class.clase.AbstractBuilder;
import Builder.Transport.ro.ase.cts.v1_inner_class.clase.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new AutobuzLinie.AutobuzLinieBuilder("Mercedes","Gogutza");
        ((AutobuzLinie.AutobuzLinieBuilder)builder).setOprireCapatLinie(true);
        ((AutobuzLinie.AutobuzLinieBuilder)builder).setModel("Volkswagen");

        AutobuzLinie autobuz1=builder.build();
        System.out.println(autobuz1.toString());
    }
}
