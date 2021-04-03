package ro.ase.cts.factorymethod;

public class Portar extends Jucator {
    public Portar(String nume, int meciuriJucate){
        super(nume,meciuriJucate);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Portar");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
