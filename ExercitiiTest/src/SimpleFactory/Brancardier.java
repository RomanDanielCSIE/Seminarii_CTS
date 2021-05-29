package SimpleFactory;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, int aniVechime) {
        super(nume, aniVechime);
    }

    @Override
    public String toString() {
        return "Brancardier: " + super.toString();
    }
}
