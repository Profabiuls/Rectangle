import java.util.ArrayList;
import java.util.List;

public abstract class Rettangolo {
    protected static int id = 0;
    protected int serial;
    protected int base;
    protected int altezza;
    protected int x;
    protected int y;
    protected String coloreSfondo;
    protected String coloreBordo;
    protected int spessoreBordo;

    private Rettangolo() {
    }

    public Rettangolo(int base, int altezza, int x, int y, String coloreSfondo, String coloreBordo, int spessoreBordo,int serial) {
        id++;
        this.base = base;
        this.altezza = altezza;
        this.x = x;
        this.y = y;
        this.coloreSfondo = coloreSfondo;
        this.coloreBordo = coloreBordo;
        this.spessoreBordo = spessoreBordo;
        this.serial = id;
    }

    protected abstract int getId();

    protected abstract void visualizzaInfo();

    protected abstract void addRettangolo(Rettangolo r);

    protected abstract void delRettangolo(int id);

}

