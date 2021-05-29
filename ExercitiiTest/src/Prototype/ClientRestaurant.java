package Prototype;

public class ClientRestaurant implements AbstractPrototype {
    private String numeClient;
    private int varsta;

    public ClientRestaurant(String numeClient, int varsta) {
        this.numeClient = numeClient;
        this.varsta = varsta;
    }
    public ClientRestaurant(){

    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "ClientRestaurant{" +
                "numeClient='" + numeClient + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public AbstractPrototype copiaza() {
        ClientRestaurant copie = new ClientRestaurant();
        copie.setNumeClient(this.numeClient);
        copie.setVarsta(this.varsta);
        return copie;
    }
}
