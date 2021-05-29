package FactoryMethod;

public class FactorySupaDeCiuperci implements AbstractFactory {
    @Override
    public Supa getSupa(int pret, String ingredientPrincipal) {
        return new SupaDeCiuperci(pret,ingredientPrincipal);
    }
}
