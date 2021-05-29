package Decorator;

public class DecoratorAnNou extends DecoratorAbstract {
    public DecoratorAnNou(NotaPlataAbstracta notaPlataAbstracta) {
        super(notaPlataAbstracta);
    }

    @Override
    public void platesteNota() {
        super.platesteNota();
        System.out.println("An nou fericit lui " + super.getNume());
    }


}
