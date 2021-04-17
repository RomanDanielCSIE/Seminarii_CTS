package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ComponenteMeniu {

    private List<ComponenteMeniu> componente;

    public Sectiune(String nume) {
        super(nume);
        this.componente= new ArrayList<>();
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Sectiune:"+this.getNume());
        for(ComponenteMeniu componenta: this.componente){
            componenta.afisareDescriere();
        }
    }

    @Override
    public ComponenteMeniu getComponenta(int poz) throws Exception {
        if(poz<componente.size() && poz >=0){
            return componente.get(poz);
        }
        else throw new IndexOutOfBoundsException();
    }

    @Override
    public void adaugaComponenta(ComponenteMeniu componenteMeniu) {
        componente.add(componenteMeniu);
    }

    @Override
    public void stergeComponenta(ComponenteMeniu componenteMeniu) {
        componente.remove(componenteMeniu);
    }
}
