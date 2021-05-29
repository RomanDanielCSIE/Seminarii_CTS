package Flyweight;

public class Main {

    public static void main(String[] args) {
        Tribuna tribuna1 = new Tribuna("VIP",5000);
        Tribuna tribuna2 = new Tribuna("SUD",8000);
        FabricaSuporter fabricaSuporter = new FabricaSuporter();
        Suporter suporter = new FabricaSuporter().getSuporter("Gigel",150,30,"Rosu");
        suporter.afisareTribuna(tribuna1);
        fabricaSuporter.getSuporter("Gigel",50,30,"Rosu").afisareTribuna(tribuna1);
    }
}
