package SimpleFactory;

public class Factory {

    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, String nume, int aniVechime){
        switch (tipPersonal){
            case BRANCARDIER:
                return new Brancardier(nume,aniVechime);
            case ASISTENT:
                return new Asistent(nume,aniVechime);
            case MEDIC:
                return new Medic(nume,aniVechime);
            default:
                throw new IllegalArgumentException();
        }
    }
}
