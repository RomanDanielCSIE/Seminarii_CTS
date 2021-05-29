package ChainOfResponsibility;

public abstract class Notificare {
    private Notificare notificare = null;

    public Notificare getNotificare() {
        return notificare;
    }

    public void setNotificare(Notificare notificare) {
        this.notificare = notificare;
    }

    public abstract void trimiteNotificare(String text, Client client);


}
