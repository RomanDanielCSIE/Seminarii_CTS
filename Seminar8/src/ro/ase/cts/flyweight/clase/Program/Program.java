package ro.ase.cts.flyweight.clase.Program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(100,3,10);
        Rezervare rezervare2 = new Rezervare(101,7,12);
        Rezervare rezervare3 = new Rezervare(102,30,22);

        FabricaClienti fabrica = new FabricaClienti();

        Client client1 = fabrica.getClient("client@test.com");
        client1.printeazaRezervare(rezervare1);
        fabrica.getClient("client2@test.com").printeazaRezervare(rezervare2);

        fabrica.getClient("client@test.com").printeazaRezervare(rezervare3);
    }
}
