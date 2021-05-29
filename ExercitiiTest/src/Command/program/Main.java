package Command.program;

import Command.ComandaPrimire;
import Command.ComandaTratare;
import Command.OperatorComenzi;
import Command.Pacient;

public class Main {
    public static void main(String[] args) {
        OperatorComenzi operator = new OperatorComenzi();
        Pacient p = new Pacient("Cristescu");
        Pacient p1 = new Pacient("Gica");
        operator.invocaComanda(new ComandaPrimire(p,6));
        operator.invocaComanda(new ComandaTratare(p,2));
        operator.executaComanda();
        operator.executaComanda();
    }
}
