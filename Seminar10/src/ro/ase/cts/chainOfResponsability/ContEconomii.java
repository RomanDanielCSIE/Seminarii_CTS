package ro.ase.cts.chainOfResponsability;

public class ContEconomii extends Cont {
    public ContEconomii(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if (suma < super.getSold()) {
            System.out.println("Se face plata din contul de economi pt suma de " + suma);
            super.setSold(super.getSold() - suma);
        }
        if (super.getCont() != null) {
            super.getCont().realizeazaPlata(suma);
        } else {
            System.out.println("Plata este refuzata");
        }
    }
}
