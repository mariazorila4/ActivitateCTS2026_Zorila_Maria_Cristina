package Strategy.ro.ase.cts.main;

import Strategy.ro.ase.cts.clase.CatelusRobot;
import Strategy.ro.ase.cts.clase.SarituraVesela;

public class Main {
    public static void main(String[] args) {
        CatelusRobot catelusRobot=new CatelusRobot("Rocky");

        catelusRobot.setWalkStrategy(new SarituraVesela());
        catelusRobot.mers();
    }
}
