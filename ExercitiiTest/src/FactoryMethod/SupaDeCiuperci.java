package FactoryMethod;

public class SupaDeCiuperci extends Supa {
    public SupaDeCiuperci(int pret, String ingredientPrincipal) {
        super(pret, ingredientPrincipal);
    }

    @Override
    public String toString() {
        return "Supa de ciuperci:"+ super.toString();
    }
}
