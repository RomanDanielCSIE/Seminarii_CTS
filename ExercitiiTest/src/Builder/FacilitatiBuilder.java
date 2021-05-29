package Builder;


public class FacilitatiBuilder implements AbstractBuilder {

    private Facilitati facilitati;

    public FacilitatiBuilder() {
        facilitati = new Facilitati(0,false,false,false,false);
    }

    public FacilitatiBuilder(int cod){
        facilitati = new Facilitati(cod,false,false,false,false);

    }

    public FacilitatiBuilder setCod(int cod){
        facilitati.setCod(cod);
        return this;
    }

    public FacilitatiBuilder setPatRabatabil(boolean patRabatabil){
        facilitati.setPatRabatabil(patRabatabil);
        return this;
    }

    public FacilitatiBuilder setMicDejun(boolean micDejun){
        facilitati.setMicDejun(micDejun);
        return this;
    }

    public FacilitatiBuilder setPapuci(boolean papuci){
        facilitati.setPapuci(papuci);
        return this;
    }

    public FacilitatiBuilder setHalat(boolean halat){
        facilitati.setHalat(halat);
        return this;
    }


    @Override
    public Facilitati build() {
        return facilitati;
    }
}
