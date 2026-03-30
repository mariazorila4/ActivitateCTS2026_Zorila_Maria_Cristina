package Builder.Transport.ro.ase.cts.v2_shallow_builder.main;

import Builder.Transport.ro.ase.cts.v2_shallow_builder.clase.AutobuzLinie;
import Builder.Transport.ro.ase.cts.v2_shallow_builder.clase.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzLinieBuilder builder=new AutobuzLinieBuilder("Gogutza");
        AutobuzLinie autobuz=builder.build();

        builder.setModel("Mercedes").setOprireCapatLinie(true).build();
        System.out.println(autobuz.toString());
    }
}
