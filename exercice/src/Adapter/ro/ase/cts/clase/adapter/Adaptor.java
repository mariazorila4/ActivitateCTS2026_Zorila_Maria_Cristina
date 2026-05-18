package Adapter.ro.ase.cts.clase.adapter;

import Adapter.ro.ase.cts.clase.smartCity.STB;

public class Adaptor extends STB {
    private Adapter.ro.ase.cts.clase.stb.STB stbRegular;

    public Adaptor(Adapter.ro.ase.cts.clase.stb.STB stbRegular) {
        super(stbRegular.getIdBilet());
        this.stbRegular = stbRegular;
    }

    @Override
    public void checkTicketScanner() {
        stbRegular.valideazaBilet();
    }
}
