package ro.ase.cts.strategy;

public class Client  {
    private String nume;
    private IModPlata modPlata;

    public void setiModPlata(IModPlata iModPlata){
        this.modPlata=iModPlata;
    }

    public void platesteNota(int suma){
        System.out.println(nume + " are de platit");
        modPlata.plateste(suma);
    }

    public Client(String nume, IModPlata modPlata) {
        super();
        this.nume = nume;
        this.modPlata = modPlata;
    }
}
