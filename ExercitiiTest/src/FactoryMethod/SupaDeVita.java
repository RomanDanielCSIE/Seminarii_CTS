package FactoryMethod;

public class SupaDeVita extends Supa {
    public SupaDeVita(int pret, String ingredientPrincipal) {
        super(pret, ingredientPrincipal);
    }

    @Override
    public String toString() {
        return "Supa de vita: " + super.toString();
    }
}
