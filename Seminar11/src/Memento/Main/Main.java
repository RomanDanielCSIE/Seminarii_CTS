package Memento.Main;

import Memento.MeciJucat;
import Memento.Memento;
import Memento.ManagerMeci;

public class Main {
    public static void main(String[] args) {
        MeciJucat meciJucat = new MeciJucat(100,"FCSB","Clinceni",20,120);
        Memento memento = meciJucat.creareMemento();
        ManagerMeci managerMeci = new ManagerMeci();
        managerMeci.adaugaMemento(memento);

        meciJucat.setNrSpectatori(400);
        meciJucat.setNrJandarmi(50);
        meciJucat.setNumeEchipaOaspeti("Sportu Sulinari");
        managerMeci.adaugaMemento(meciJucat.creareMemento());

        System.out.println(meciJucat);
        meciJucat.setMemento(managerMeci.getMemento(0));
    }
}
