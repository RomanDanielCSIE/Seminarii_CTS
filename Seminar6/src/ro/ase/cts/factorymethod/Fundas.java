package ro.ase.cts.factorymethod;

public class Fundas extends Jucator {
    public Fundas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Fundas");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
