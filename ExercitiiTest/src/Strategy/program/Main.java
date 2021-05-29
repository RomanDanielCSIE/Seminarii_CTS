package Strategy.program;

import Strategy.Spectator;
import Strategy.VerificaPeluza;
import Strategy.VerificaVIP;

public class Main {
    public static void main(String[] args) {
        Spectator spectator1 = new Spectator("PumnIute", new VerificaPeluza());
     spectator1.intrareStadion(null,"pumn","tricou");
     spectator1.setVerificaSpectator(new VerificaVIP());
     spectator1.intrareStadion("VIP","pumnu","camasa");
    }
}
