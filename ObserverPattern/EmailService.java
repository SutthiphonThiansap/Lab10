package ObserverPattern;

import DataModels.Order;

public class EmailService implements OrderObserver {
    @Override
    public void update(Order order){
        System.out.println("[Email Service] Confirmation email sent to" 
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
