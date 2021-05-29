package SimpleFactory;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int aniVechime) {
        super(nume, aniVechime);
    }

    @Override
    public String toString() {
        return "Asistent: " + super.toString();
    }
}
