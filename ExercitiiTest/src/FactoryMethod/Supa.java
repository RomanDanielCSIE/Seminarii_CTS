package FactoryMethod;

public abstract class Supa {
    private int pret;
    private String ingredientPrincipal;

    public Supa(int pret, String ingredientPrincipal) {
        this.pret = pret;
        this.ingredientPrincipal = ingredientPrincipal;
    }

    @Override
    public String toString() {
        return "Supa{" + "pret=" + pret +
                ", ingredientPrincipal='" + ingredientPrincipal + '\'' +
                '}';
    }
}
