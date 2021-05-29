package Decorator;

public class DecoratorCraciun extends DecoratorAbstract {
    public DecoratorCraciun(NotaPlataAbstracta notaPlataAbstracta) {
        super(notaPlataAbstracta);
    }

    @Override
    public void platesteNota() {
        super.platesteNota();
        System.out.println("Craciun fericit lui " + super.getNume());
    }
}
