package Decorator;

public abstract class DecoratorAbstract implements NotaPlataAbstracta {
    private NotaPlataAbstracta notaPlataAbstracta;

    public DecoratorAbstract(NotaPlataAbstracta notaPlataAbstracta) {
        this.notaPlataAbstracta = notaPlataAbstracta;
    }

    @Override
    public void platesteNota() {
        notaPlataAbstracta.platesteNota();
    }

    @Override
    public String getNume() {
        return notaPlataAbstracta.getNume();
    }
}
