package SimpleFactory;

public abstract class PersonalSpital {
    private String nume;
    private int aniVechime;

    public PersonalSpital(String nume, int aniVechime) {
        this.nume = nume;
        this.aniVechime = aniVechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAniVechime() {
        return aniVechime;
    }

    public void setAniVechime(int aniVechime) {
        this.aniVechime = aniVechime;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", aniVechime=" + aniVechime +
                '}';
    }
}
