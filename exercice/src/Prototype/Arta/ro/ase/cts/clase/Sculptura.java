package Prototype.Arta.ro.ase.cts.clase;

public class Sculptura implements SculpturaAbstract {
    private String model;
    private String material;
    private String culoare;
    private float latime;
    private float lungime;
    private float inaltime;

    public Sculptura(String model, String material, String culoare, float latime, float lungime, float inaltime) {
        if (model.length() > 1) {
            this.model = model;
        } else {
            this.model = "standard";
        }

        if (material.length() > 1) {
            this.material = material;
        } else {
            this.material = "ceramica";
        }

        if (culoare.length() > 1) {
            this.culoare = culoare;
        } else {
            this.culoare = "caramiziu";
        }

        if (latime > 10) {
            this.latime = latime;
        } else {
            this.latime = 10;
        }

        if (lungime > 10) {
            this.lungime = lungime;
        } else {
            this.lungime = 10;
        }

        if (inaltime > 10) {
            this.inaltime = inaltime;
        } else {
            this.inaltime = 10;
        }

    }

    public Sculptura() {
    }

    @Override
    public Sculptura clone() {
        Sculptura sculpturaNoua = new Sculptura();
        sculpturaNoua.model = model;
        sculpturaNoua.material = material;
        sculpturaNoua.culoare = culoare;
        sculpturaNoua.latime = latime;
        sculpturaNoua.lungime = lungime;
        sculpturaNoua.inaltime = inaltime;

        return sculpturaNoua;
    }

    public void setCuloare(String culoare) {
        if (culoare.length() > 1) {
            this.culoare = culoare;
        } else {
            this.culoare = "caramiziu";
        }
    }

    public void setLatime(float latime) {
        if (latime > 10) {
            this.latime = latime;
        } else {
            this.latime = 10;
        }
    }

    public void setLungime(float lungime) {
        if (lungime > 10) {
            this.lungime = lungime;
        } else {
            this.lungime = 10;
        }
    }

    public void setInaltime(float inaltime) {
        if (inaltime > 10) {
            this.inaltime = inaltime;
        } else {
            this.inaltime = 10;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sculptura{");
        sb.append("model='").append(model).append('\'');
        sb.append(", material='").append(material).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", latime=").append(latime);
        sb.append(", lungime=").append(lungime);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }
}
