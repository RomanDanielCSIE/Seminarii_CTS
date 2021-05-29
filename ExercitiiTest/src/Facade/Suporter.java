package Facade;

public class Suporter {
    private String serieCI;
    private boolean areCazier;
    private boolean esteRecidivist;

    public Suporter(String serieCI, boolean areCazier, boolean esteRecidivist) {
        this.serieCI = serieCI;
        this.areCazier = areCazier;
        this.esteRecidivist = esteRecidivist;
    }

    public String getSerieCI() {
        return serieCI;
    }

    public boolean isAreCazier() {
        return areCazier;
    }

    public boolean isEsteRecidivist() {
        return esteRecidivist;
    }
}
