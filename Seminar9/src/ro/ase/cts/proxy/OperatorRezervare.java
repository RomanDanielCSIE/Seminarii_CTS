package ro.ase.cts.proxy;

public class OperatorRezervare implements IOperatorRezervari {

    private String numeRestaurant;

    public OperatorRezervare(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public void rezerva(int numarPersoane) {
        System.out.println("A fost realizata o rezervare la "+ numeRestaurant+ "pentru un numar de"+ numarPersoane);

    }
}
