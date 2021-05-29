package Command;

public abstract class ComandaAbstracta {
    protected Pacient pacient;
    protected  int nivel;

    public ComandaAbstracta(Pacient pacient,int nivel) {
        this.pacient = pacient;
        this.nivel=nivel;

    }
    public abstract void executa();
}
