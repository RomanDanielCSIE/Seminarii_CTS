package Prototype;

public class Rezervare implements AbstractPrototype{
    private String numeRestaurant;
    private int numarLocuri;
    private String ora;

    public Rezervare(String numeRestaurant, int numarLocuri, String ora) {
        this.numeRestaurant = numeRestaurant;
        this.numarLocuri = numarLocuri;
        this.ora = ora;
    }

    public Rezervare(){
        super();
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + numeRestaurant + '\'' +
                ", numarLocuri=" + numarLocuri +
                ", ora='" + ora + '\'' +
                '}';
    }

    @Override
    public AbstractPrototype copiaza() {
        Rezervare copie = new Rezervare();
        copie.setNumeRestaurant(this.numeRestaurant);
        copie.setNumarLocuri(this.numarLocuri);
        copie.setOra(this.ora);
        return copie;
    }
}
