package Observer;

public class EmailNotificationObserver implements OrderObserver{

    @Override
    public void update(String mensaje) {
        System.out.println("Enviando correo al cliente... ");
    }
}
