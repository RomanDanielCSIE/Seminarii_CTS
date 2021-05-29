package Composite;

public  abstract class Stadion {
    private String nume;

    public Stadion(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void afisareDesc();
    public abstract void adaugaComponenta(Stadion componenta);
    public abstract void stergeComponenta(Stadion componenta);
    public abstract Stadion getComponenta(int index) throws Exception;
}
