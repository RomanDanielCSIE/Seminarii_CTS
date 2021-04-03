package ro.ase.cts.program;

import ro.ase.cts.factorymethod.*;

public class Main {

    private static void afisareInformatiiJucator(AbstractFactory abstractFactory, String nume, int meciuriJucate){
        Jucator jucator=abstractFactory.getJucator(nume,meciuriJucate);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args){
        afisareInformatiiJucator(new FactoryAtacant(),"Gerard",10);
        afisareInformatiiJucator(new FactoryPortar(),"Pique",7);
        afisareInformatiiJucator(new FactoryFundas(),"Xavi",5);
        afisareInformatiiJucator(new FactoryMijlocas(),"DeBruyne",1000);


    }
}
