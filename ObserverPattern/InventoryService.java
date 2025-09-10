package ObserverPattern;
import DataModels.*;
public class InventoryService implements OrderObserver {
    @Override
    public void update(Order order){
        System.out.println("[Inventory Service] Stock has been update for order" 
        + order.customerEmail()+ "for order: " + order.orderId());
    }

    @Override
    public void add(OrderObserver observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(OrderObserver observer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    
}
