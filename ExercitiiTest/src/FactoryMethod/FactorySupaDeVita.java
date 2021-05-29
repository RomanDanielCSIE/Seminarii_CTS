package FactoryMethod;

public class FactorySupaDeVita  implements AbstractFactory {
    @Override
    public Supa getSupa(int pret, String ingredientPrincipal) {
        return new SupaDeVita(pret,ingredientPrincipal);
    }
}
