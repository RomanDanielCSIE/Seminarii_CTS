package Flyweight;

public class Tribuna {
    private String nume;
    private int capacitate;


    public Tribuna(String nume,int capacitate) {
        this.nume = nume;
        this.capacitate = capacitate;
    }

    @Override
    public String toString() {
        return "Tribuna{" +
                "nume='" + nume + '\'' +
                ", capacitate=" + capacitate +
                '}';
    }
}
