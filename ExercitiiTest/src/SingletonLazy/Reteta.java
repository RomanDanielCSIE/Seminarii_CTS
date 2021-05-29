package SingletonLazy;

public class Reteta {
    private int cod;
    private String numeEmitent;
    private int pret;

    //instanta Singleton initializata cu null;
    private static Reteta reteta= null;


    public static synchronized Reteta getInstance(int cod, String numeEmitent, int pret){
        if(reteta == null){
            reteta = new Reteta(cod, numeEmitent,pret);
        }
        return reteta;
    }

    public Reteta(int cod, String numeEmitent, int pret) {
        super();
        this.cod = cod;
        this.numeEmitent = numeEmitent;
        this.pret = pret;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNumeEmitent(String numeEmitent) {
        this.numeEmitent = numeEmitent;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return this.cod+ this.numeEmitent+ this.pret;
    }
}
