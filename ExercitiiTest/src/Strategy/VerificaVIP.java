package Strategy;

import State.Scaun;

public class VerificaVIP implements IVerificaSpectator {
    @Override
    public void verificaSpectator(String bilet, String bagaj, String haine) {
        if(bilet.compareTo("VIP")==0){
            System.out.println("Bine ati venit!");
        }
        else{
            System.out.println("Nu aveti voie la VIP");
        }
    }
}
