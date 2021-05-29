package SingletonLazy.program;

import SingletonLazy.Reteta;

public class main {
    public static void main(String[] args) {
        Reteta reteta = Reteta.getInstance(1,"Liana",20);
        Reteta reteta2 = Reteta.getInstance(2,"Petrica",100);
        System.out.println(reteta.toString());
        System.out.println(reteta2.toString());
        reteta2.setCod(5);
        reteta2.setNumeEmitent("Krista");
        reteta2.setPret(200);
        System.out.println(reteta2.toString());
        System.out.println(reteta.toString());
    }
}
