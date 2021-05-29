package Builder.program;

import Builder.Facilitati;
import Builder.FacilitatiBuilder;

public class Main {
    public static void main(String[] args) {
        Facilitati facilitati = new Facilitati(1,false,false,false,false);
        System.out.println(facilitati.toString());
        Facilitati facilitati1 = new FacilitatiBuilder().setCod(2).setHalat(true).setPapuci(true).build();
        System.out.println(facilitati1);
    }
}
