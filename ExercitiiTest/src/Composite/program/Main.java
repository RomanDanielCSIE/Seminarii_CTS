package Composite.program;

import Composite.Scaun;
import Composite.Sectiune;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sectiune peluza = new Sectiune("Peluza Nord");
        Sectiune tribuna = new Sectiune("Tribuna 1");
        Scaun scaun1 = new Scaun("Scaun normal");
        Scaun scaun2 = new Scaun("Fotoliu");
        peluza.adaugaComponenta(scaun1);
        peluza.adaugaComponenta(scaun1);
        tribuna.adaugaComponenta(scaun2);
        tribuna.adaugaComponenta(scaun2);
        tribuna.adaugaComponenta(scaun1);
        Sectiune stadion = new Sectiune("Stadion");
        stadion.adaugaComponenta(peluza);
        stadion.adaugaComponenta(tribuna);
        stadion.afisareDesc();
    }
}
