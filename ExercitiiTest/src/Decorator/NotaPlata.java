package Decorator;

public class NotaPlata implements NotaPlataAbstracta {
    private String numeClient;
    private float totalPlata;

    public NotaPlata(String numeClient, float totalPlata) {
        this.numeClient = numeClient;
        this.totalPlata = totalPlata;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public float getTotalPlata() {
        return totalPlata;
    }

    @Override
    public void platesteNota() {
        System.out.println("Clientul" + getNumeClient()+ "a platit nota de "+ getTotalPlata());
    }

    @Override
    public String getNume() {
        return this.numeClient;
    }
}
