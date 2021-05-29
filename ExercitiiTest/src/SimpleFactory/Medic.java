package SimpleFactory;

public class Medic extends PersonalSpital {
    public Medic(String nume, int aniVechime) {
        super(nume, aniVechime);
    }

    @Override
    public String toString() {
        return "Medic: " + super.toString();
    }
}
