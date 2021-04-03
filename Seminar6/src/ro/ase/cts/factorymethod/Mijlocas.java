package ro.ase.cts.factorymethod;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Mijlocas ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
