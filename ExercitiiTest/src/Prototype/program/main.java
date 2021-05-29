package Prototype.program;

import Prototype.AbstractPrototype;
import Prototype.ClientRestaurant;

public class main {
    public static void main(String[] args) {
        AbstractPrototype abstractPrototype = new ClientRestaurant("Farapon",24);
        AbstractPrototype abstractPrototype1 = abstractPrototype.copiaza();
        System.out.println(abstractPrototype.toString());
        System.out.println(abstractPrototype1.toString());
        ClientRestaurant client = (ClientRestaurant) abstractPrototype.copiaza();
        System.out.println(client.toString());
        client.setNumeClient("Mircea");
        client.setVarsta(45);
        System.out.println(client.toString());
    }
}
