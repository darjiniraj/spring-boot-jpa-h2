package in.niraj.spring.springbootjpah2.controller;

import in.niraj.spring.springbootjpah2.entity.Order;
import in.niraj.spring.springbootjpah2.repository.OrderRepostiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * created by niraj on Jul, 2018
 */
@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderRepostiroty orderRepostiroty;

    @PostMapping("/order")
    public Order saveOrder(@RequestBody Order order) {
        return orderRepostiroty.save(order);
    }

    @GetMapping("/order")
    public List<Order> getAllOrder() {
        return (List<Order>) orderRepostiroty.findAll();
    }

    @GetMapping("/order/{id}")
    public Order getOrderById(@PathVariable String id) {
        Optional<Order> dbOrder = orderRepostiroty.findById(id);
        if (dbOrder.isPresent())
            return dbOrder.get();
        return null;
    }

    @DeleteMapping("/order/{id}")
    public Order deleteOrder(@PathVariable String id) {
        orderRepostiroty.deleteById(id);
        return getOrderById(id);
    }


}
