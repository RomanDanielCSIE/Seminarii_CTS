package ro.ase.cts.composite.clase;

public abstract class ComponenteMeniu {

    private String nume;

    public abstract void afisareDescriere();
    public abstract ComponenteMeniu getComponenta(int poz) throws Exception;
    public abstract void adaugaComponenta(ComponenteMeniu componenteMeniu);
    public abstract void stergeComponenta(ComponenteMeniu componenteMeniu);

    public ComponenteMeniu(String nume) {
        super();
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}
