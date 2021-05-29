package FactoryMethod;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(int pret, String ingredientPrincipal) {
        super(pret, ingredientPrincipal);
    }

    @Override
    public String toString() {
        return "Supa de legume: " + super.toString();
    }
}
