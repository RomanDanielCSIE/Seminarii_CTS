package Command;

public class ComandaPrimire extends ComandaAbstracta {
    public ComandaPrimire(Pacient pacient,int nivel) {
        super(pacient,nivel);
    }

    @Override
    public void executa() {
        super.pacient.primire(super.nivel);
    }
}
