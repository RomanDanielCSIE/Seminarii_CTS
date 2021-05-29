package Template.Main;

import Template.Spectator;
import Template.SpectatorAbstract;
import Template.SpectatorVIP;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator = new Spectator("Perry");
        SpectatorAbstract spectatorVIP = new SpectatorVIP("VIP","Nord");
        spectator.intrarePeStadion();
        spectatorVIP.intrarePeStadion();
    }
}
