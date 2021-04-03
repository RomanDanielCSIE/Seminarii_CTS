package ro.ase.cts.factorymethod;

public abstract class Jucator {
    private String nume;
    private int meciuriJucate;



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nume);
        builder.append(meciuriJucate);
        return  builder.toString();
    }

    public Jucator(String nume, int meciuriJucate) {
        this.nume = nume;
        this.meciuriJucate = meciuriJucate;
    }
}
