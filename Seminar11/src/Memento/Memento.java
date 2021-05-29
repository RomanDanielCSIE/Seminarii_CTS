package Memento;

public class Memento {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspete;

    public Memento(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspete) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspete = numeEchipaOaspete;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public void setNumeEchipaGazda(String numeEchipaGazda) {
        this.numeEchipaGazda = numeEchipaGazda;
    }

    public String getNumeEchipaOaspete() {
        return numeEchipaOaspete;
    }

    public void setNumeEchipaOaspete(String numeEchipaOaspete) {
        this.numeEchipaOaspete = numeEchipaOaspete;
    }
}
