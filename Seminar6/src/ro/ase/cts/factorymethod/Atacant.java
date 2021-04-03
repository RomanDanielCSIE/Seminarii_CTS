package ro.ase.cts.factorymethod;

public class Atacant extends Jucator {
    public Atacant(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Atacant");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
