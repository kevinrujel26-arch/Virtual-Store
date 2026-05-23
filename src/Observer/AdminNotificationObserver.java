package Observer;

public class AdminNotificationObserver implements  OrderObserver{

    @Override
    public void update(String mensaje) {
        System.out.println("Notificando al administrador...");

    }
}
