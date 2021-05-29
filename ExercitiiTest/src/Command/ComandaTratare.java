package Command;

public class ComandaTratare extends ComandaAbstracta {
    public ComandaTratare(Pacient pacient,int nivel) {
        super(pacient,nivel);
    }

    @Override
    public void executa() {
        super.pacient.tratare(super.nivel);
    }
}
