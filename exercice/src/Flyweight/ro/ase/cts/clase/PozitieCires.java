package Flyweight.ro.ase.cts.clase;

public class PozitieCires {
    private int coordonataX;
    private int coordonataY;
    private int varsta;

    public PozitieCires(int coordonataX, int coordonataY, int varsta) {
        this.coordonataX = coordonataX;
        this.coordonataY = coordonataY;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PozitieCires{");
        sb.append("coordonataX=").append(coordonataX);
        sb.append(", coordonataY=").append(coordonataY);
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
