package Composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends Stadion {
    private List<Stadion> componente;
    public Sectiune(String nume) {
        super(nume);
        this.componente = new ArrayList<>();
    }

    @Override
    public void afisareDesc() {
        System.out.println("Sectiune: "+ this.getNume());
        for(Stadion c:componente){
            c.afisareDesc();
        }
    }

    @Override
    public void adaugaComponenta(Stadion componenta) {
        componente.add(componenta);
    }

    @Override
    public void stergeComponenta(Stadion componenta) {
        componente.remove(componenta);
    }

    @Override
    public Stadion getComponenta(int index) throws Exception {
        if(index>=0 && index<componente.size()){
            return componente.get(index);
        }
        throw new IndexOutOfBoundsException();
    }
}
