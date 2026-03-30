package Builder.Transport.ro.ase.cts.v3_deep_builder.main;

import Builder.Transport.ro.ase.cts.v3_deep_builder.clase.AutobuzLinie;
import Builder.Transport.ro.ase.cts.v3_deep_builder.clase.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzLinieBuilder builder=new AutobuzLinieBuilder("Mercedes", "Gigel", true, false);

        AutobuzLinie auto=builder.build("Marin");
        ((AutobuzLinie)auto).setOprireCapatLinie(false);
        System.out.println(auto.toString());
    }
}
