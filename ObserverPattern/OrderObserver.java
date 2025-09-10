package ObserverPattern;
import DataModels.Order;

public interface OrderObserver {
    void update(Order order);

    void add(OrderObserver observer);

    void remove(OrderObserver observer);
    
}
