package ro.ase.cts.builder;

public class Rezervare {
    private int cod;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoareInclusa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public Rezervare(int cod, boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoareInclusa, boolean muzicaAmbientala, String genMuzica) {
        this.cod = cod;
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "cod=" + cod +
                ", mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoareInclusa=" + bauturaRacoritoareInclusa +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
