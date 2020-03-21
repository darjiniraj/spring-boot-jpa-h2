package in.niraj.spring.springbootjpah2.service;

import in.niraj.spring.springbootjpah2.entity.Order;

import java.util.List;

/**
 * created by pc on Mar, 2020
 */
public interface IOrderService {


    Order createOrder(Order order);

    List<Order> getAllOrder();

    Order getOrderById(String id);

    boolean deleteOrderById(String id);
}
