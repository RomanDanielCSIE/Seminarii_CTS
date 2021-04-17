package ro.ase.cts.flyweight.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private int oraRezervarii;

    public Rezervare(int nrMasa, int nrPersoane, int oraRezervarii) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervarii = oraRezervarii;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", oraRezervarii=" + oraRezervarii +
                '}';
    }
}
