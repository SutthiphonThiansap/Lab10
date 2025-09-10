package StrategyPattern;
import DataModels.*;

/**
 * interface สำหรับกลยุทธ์ส่วนลด
 */

public interface DiscountStrategy {
    double applyDiscount(Order order);
}