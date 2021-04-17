package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract {
    private String nume;
    private int nrTelefon;
    private String email;

    public Client(String nume, int nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

}
