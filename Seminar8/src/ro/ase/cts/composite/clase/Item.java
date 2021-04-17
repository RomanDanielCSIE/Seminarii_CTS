package ro.ase.cts.composite.clase;

public class Item extends ComponenteMeniu {
    public Item(String nume) {
        super(nume);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Item:"+this.getNume());
    }

    @Override
    public ComponenteMeniu getComponenta(int poz) throws Exception {
       throw new Exception("Nu se poate!");
    }

    @Override
    public void adaugaComponenta(ComponenteMeniu componenteMeniu) {
        throw new IllegalArgumentException();
    }

    @Override
    public void stergeComponenta(ComponenteMeniu componenteMeniu) {
        throw new IllegalArgumentException();
    }
}
