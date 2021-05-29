package ChainOfResponsibility;

public class NotificareEmail extends Notificare {
    @Override
    public void trimiteNotificare(String text, Client client) {
        if (client.getEmail() != null && client.getNumarTelefon() == null) {
            System.out.println("Notificare" + text + "a fost trimisa prin email lui"
                    + client.getNume());
        } else if (super.getNotificare() != null) {
            super.getNotificare().trimiteNotificare(text, client);
        } else {
            System.out.println("Nu exista succesor");
        }
    }
}
