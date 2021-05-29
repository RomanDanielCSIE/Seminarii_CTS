package Flyweight;

public class Suporter implements FlyweightAbstract {
    private int inaltime;
    private int latime;
    private String culoareTricou;
    private String nume;

    public Suporter(int inaltime, int latime, String culoareTricoum,String nume) {
        this.inaltime = inaltime;
        this.latime = latime;
        this.culoareTricou = culoareTricou;
        this.nume=nume;
    }

    @Override
    public void afisareTribuna(Tribuna tribuna) {
        System.out.println(tribuna.toString()+ this.toString());
    }

    @Override
    public String toString() {
        return "Suporter{" +
                "inaltime=" + inaltime +
                ", latime=" + latime +
                ", culoareTricou='" + culoareTricou + '\'' + "nume=" + this.nume+
                '}';
    }
}
