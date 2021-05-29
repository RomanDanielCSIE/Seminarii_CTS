package Strategy;

public class VerificaPeluza implements IVerificaSpectator {
    @Override
    public void verificaSpectator(String bilet, String bagaj, String haine) {
        if(bagaj.compareTo("rucsac")==0 && haine.compareTo("tricou")==0){
            System.out.println("Bine ati venit");
        }
        else{
            System.out.println("Nu aveti voie");
        }
    }
}
