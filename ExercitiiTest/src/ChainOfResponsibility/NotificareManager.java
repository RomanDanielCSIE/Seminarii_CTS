package ChainOfResponsibility;

public class NotificareManager extends Notificare {
    @Override
    public void trimiteNotificare(String text, Client client) {
        if(client.getNumarTelefon()==null && client.getEmail()==null){
            System.out.println("Notificare" + text + "a fost trimisa prin manager lui"
                    + client.getNume());
        }

    }
}
