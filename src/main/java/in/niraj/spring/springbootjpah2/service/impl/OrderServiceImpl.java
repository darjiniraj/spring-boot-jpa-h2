package in.niraj.spring.springbootjpah2.service.impl;

import in.niraj.spring.springbootjpah2.entity.Order;
import in.niraj.spring.springbootjpah2.repository.OrderRepostiroty;
import in.niraj.spring.springbootjpah2.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * created by pc on Mar, 2020
 */

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderRepostiroty orderRepostiroty;


    @Override
    public Order createOrder(Order order) {
        return orderRepostiroty.save(order);
    }

    @Override
    public List<Order> getAllOrder() {
        return (List<Order>) orderRepostiroty.findAll();
    }

    @Override
    public Order getOrderById(String id) {
        Optional<Order> dbOrder = orderRepostiroty.findById(id);
        return dbOrder.orElse(null);
    }

    @Override
    public boolean deleteOrderById(String id) {
        orderRepostiroty.deleteById(id);
        return getOrderById(id) == null;
    }
}
