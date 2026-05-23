package Observer;

public class InventoryObserver implements OrderObserver{

    @Override
    public void update(String mensaje) {

        System.out.println("Acutalizando inventario..");
    }
}
