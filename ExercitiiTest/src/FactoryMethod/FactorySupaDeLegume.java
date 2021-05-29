package FactoryMethod;

public class FactorySupaDeLegume implements AbstractFactory {
    @Override
    public Supa getSupa(int pret, String ingredientPrincipal) {
        return new SupaDeLegume(pret,ingredientPrincipal);

    }
}
