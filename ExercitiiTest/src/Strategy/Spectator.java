package Strategy;

public class Spectator {
    private String nume;
    private IVerificaSpectator verificaSpectator;

    public Spectator(String nume, IVerificaSpectator verificaSpectator) {
        this.nume = nume;
        this.verificaSpectator = verificaSpectator;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVerificaSpectator(IVerificaSpectator verificaSpectator) {
        this.verificaSpectator = verificaSpectator;
    }

    public void intrareStadion(String bilet, String bagaj, String haine){
        System.out.println(this.nume + "are bilet"+ bilet);
        verificaSpectator.verificaSpectator(bilet,bagaj,haine);
    }
}
