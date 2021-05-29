package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Cristescu", null, "fasfaf");
        NotificareTelefon tel=new NotificareTelefon();
        NotificareEmail mail=new NotificareEmail();
        NotificareManager manager=new NotificareManager();
        tel.setNotificare(mail);
        mail.setNotificare(manager);
        tel.trimiteNotificare("Buna",client);

    }
}
