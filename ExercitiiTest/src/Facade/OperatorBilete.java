package Facade;

public class OperatorBilete {
    private String nume;

    public OperatorBilete(String nume) {
        this.nume = nume;
    }

    public boolean areBilet(Suporter suporter){
        int numar = Integer.parseInt(suporter.getSerieCI().substring(0,3));
        int suma = 0;
        while(numar>0){
            suma+=numar%10;
            numar/=10;
        }
        return suma>=5;
    }
    public boolean nuAreCazier(Suporter suporter){
        return suporter.isAreCazier();
    }

    public boolean nuEsteRecidivist(Suporter suporter){
        return suporter.isEsteRecidivist();
    }
}
