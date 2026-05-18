package Adapter.ro.ase.cts.main;


import Adapter.ro.ase.cts.clase.adapter.Adaptor;
import Adapter.ro.ase.cts.clase.smartCity.STB;

public class Main {

    public static void verificareBilet(STB stbSmCity){
        stbSmCity.checkTicketScanner();
    }

    public static void main(String[] args) {
      Adapter.ro.ase.cts.clase.stb.STB stbRegular=new Adapter.ro.ase.cts.clase.stb.STB("101123");
      STB stbCity=new STB("202123");

      verificareBilet(stbCity);
      Adaptor adapterSTBRegular=new Adaptor(stbRegular);
      verificareBilet(adapterSTBRegular);
    }
}
