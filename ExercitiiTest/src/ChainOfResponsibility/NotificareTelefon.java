package ChainOfResponsibility;

public class NotificareTelefon extends Notificare {
    @Override
    public void trimiteNotificare(String text, Client client) {
        if(client.getNumarTelefon()!=null){
            System.out.println("Notificare" + text + "a fost trimisa prin SMS lui"
            + client.getNume());
        }
        else if(super.getNotificare()!=null){
            super.getNotificare().trimiteNotificare(text,client);
        }
        else {
            System.out.println("Nu exista succesor");
        }
    }
}
