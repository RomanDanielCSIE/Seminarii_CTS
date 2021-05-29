package State.program;

import State.Liber;
import State.Ocupat;
import State.Rezervat;
import State.Scaun;

public class Main {
    public static void main(String[] args) {
        Scaun scaun = new Scaun(1);
        scaun.rezervaScaun("Gigel");
        scaun.rezervaScaun("Gica");
        scaun.ocupaScaun("Gigel");
        scaun.elibereazaScaun("Gigel");
        Scaun scaun1 = new Scaun(2);
        Rezervat rezervat = new Rezervat();
        Ocupat ocupat = new Ocupat();
        Liber liber = new Liber();
        scaun1.elibereazaScaun("Fane");
        liber.schimbaStare(scaun1);
        rezervat.schimbaStare(scaun1);
        ocupat.schimbaStare(scaun);
    }
}
