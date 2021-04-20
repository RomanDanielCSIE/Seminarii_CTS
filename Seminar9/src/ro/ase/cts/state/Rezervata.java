package ro.ase.cts.state;

public class Rezervata implements StareMasa {

    @Override
    public void modificaStare(Masa masa) {
        if (masa.getStareMasa() instanceof Libera){
            masa.setStareMasa(this);
        }
    }
}
