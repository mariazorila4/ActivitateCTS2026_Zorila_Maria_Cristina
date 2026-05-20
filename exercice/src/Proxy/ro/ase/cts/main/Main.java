package Proxy.ro.ase.cts.main;

import Proxy.ro.ase.cts.clase.AccesLounge;
import Proxy.ro.ase.cts.clase.AccesPetrecere;
import Proxy.ro.ase.cts.clase.Pisica;
import Proxy.ro.ase.cts.clase.Portar;

public class Main {
    public static void main(String[] args) {
        AccesPetrecere accesVip=new AccesLounge("miauVipZone", 10, 9);
        AccesPetrecere accesPuf=new AccesLounge("pernutaDePuf", 20, 15);

        AccesPetrecere portarVip=new Portar(accesVip);
        AccesPetrecere portarPuf=new Portar(accesPuf);

        Pisica miti=new Pisica("Miti cocheta", true, true);
        Pisica miki=new Pisica("Miki", true, true);
        Pisica misu=new Pisica("Misu", false, false);
        Pisica roxy=new Pisica("Roxy", true, false);

        portarPuf.permiteAccesul(miti);
        portarPuf.permiteAccesul(roxy);
        portarPuf.permiteAccesul(misu);
        portarVip.permiteAccesul(miki);
    }
}
