package Observer;

public class ClientAbonat implements Observer {

    public String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteAnunt(String mesaj) {
        System.out.println(this.numeClient + "a primit mesajul: " + mesaj);
    }
}
