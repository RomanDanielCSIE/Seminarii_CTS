package Decorator.program;

import Decorator.DecoratorAbstract;
import Decorator.DecoratorAnNou;
import Decorator.DecoratorCraciun;
import Decorator.NotaPlata;

public class Main {

    public static void main(String[] args) {
        NotaPlata notaPlata = new NotaPlata("Radja",500);
        notaPlata.platesteNota();
        DecoratorAbstract urareCraiun = new DecoratorCraciun(notaPlata);
        urareCraiun.platesteNota();
        DecoratorAbstract urareAnNou = new DecoratorAnNou(urareCraiun);
        urareAnNou.platesteNota();
    }

}
