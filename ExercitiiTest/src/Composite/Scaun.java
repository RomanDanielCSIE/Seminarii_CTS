package Composite;

public class Scaun extends Stadion {
    public Scaun(String nume) {
        super(nume);
    }

    @Override
    public void afisareDesc() {
        System.out.println("Scaun " + super.getNume());
    }

    @Override
    public void adaugaComponenta(Stadion componenta) {
        throw new IllegalArgumentException();
    }

    @Override
    public void stergeComponenta(Stadion componenta) {
    throw new IllegalArgumentException();
    }

    @Override
    public Stadion getComponenta(int index) throws Exception {
        throw new Exception("Nu se poate");
    }
}
