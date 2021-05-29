package FactoryMethod.program;

import FactoryMethod.*;

public class Main {

    private static void afisareInfoSupa(AbstractFactory abstractFactory,int pret, String ingredient){
        Supa supa = abstractFactory.getSupa(pret,ingredient);
        System.out.println(supa.toString());
    }
    public static void main(String[] args) {
        afisareInfoSupa(new FactorySupaDeLegume(),10,"Legume");
        afisareInfoSupa(new FactorySupaDeCiuperci(),15,"Ciuperci halucinogene");
        afisareInfoSupa(new FactorySupaDeVita(),20,"Vita");
    }
}
