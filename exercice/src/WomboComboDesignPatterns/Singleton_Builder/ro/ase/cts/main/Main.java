package WomboComboDesignPatterns.Singleton_Builder.ro.ase.cts.main;

import WomboComboDesignPatterns.Singleton_Builder.ro.ase.cts.clase.Calculator;
import WomboComboDesignPatterns.Singleton_Builder.ro.ase.cts.clase.RegistruComenzi;

public class Main {
    public static void main(String[] args) {
        Calculator calc1=new Calculator.Builder("i5","SSD").
                setAlimentareRapida(true).setPlacaVideoDedicata(true).setRam(8).build();

        Calculator calc2=new Calculator.Builder("i7","HDD").
                setAlimentareRapida(false).setPlacaVideoDedicata(false).setRam(16).build();

        Calculator calc3=new Calculator.Builder("i9","SSD").
                setAlimentareRapida(true).setPlacaVideoDedicata(false).setRam(32).build();

        Calculator calc4=new Calculator.Builder("AMD","HDD").
                setAlimentareRapida(false).setPlacaVideoDedicata(true).setRam(64).build();

        RegistruComenzi registru=RegistruComenzi.getInstance("eMag",10,7);

        registru.preiaComanda("Ionel",calc1);
        registru.preiaComanda("Irina",calc2);
        registru.preiaComanda("Miruna",calc3);
        registru.preiaComanda("Mirel",calc4);
    }
}
