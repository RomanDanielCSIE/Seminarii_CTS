package ro.ase.cts.builder.builderprogram;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;

public class builderMain {
    public static void main(String[] args) {
        Rezervare rezervare= new Rezervare(1,false,true,true,true,"Trap");
        System.out.println(rezervare);
        Rezervare rezervare2=new RezervareBuilder().setCod(10).setBauturaRacoritoareInclusa(true).setMuzicaAmbientala(true).build();
        System.out.println(rezervare2.toString());
        Rezervare rezervare3= new RezervareBuilder().setCod(11).setScaunErgonomic(true).build();
        Rezervare rezervare4= new RezervareBuilder(12).setGenMuzica("manele").build();

        RezervareBuilderV2 builderV2 = new RezervareBuilderV2().setBauturaRacoritoareInclusa(true).setMancareInclusa(true);
        Rezervare rezervare5 = builderV2.setCod(5).build();

    }
}
