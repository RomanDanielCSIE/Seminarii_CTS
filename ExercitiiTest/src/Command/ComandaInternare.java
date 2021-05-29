package Command;

public class ComandaInternare extends ComandaAbstracta {
    public ComandaInternare(Pacient pacient, int nivel) {
        super(pacient, nivel);
    }

    @Override
    public void executa() {
        super.pacient.internare(super.nivel);
    }
}
