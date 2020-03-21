package in.niraj.spring.springbootjpah2.service;

import in.niraj.spring.springbootjpah2.entity.Order;
import in.niraj.spring.springbootjpah2.repository.OrderRepostiroty;
import in.niraj.spring.springbootjpah2.service.impl.OrderServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * created by pc on Mar, 2020
 */

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImplTest {

    @InjectMocks
    private OrderServiceImpl orderService;

    @Mock
    private OrderRepostiroty orderRepostiroty;

    @Test
    public void whenGetAllOrder_thenReturnOrderList() {

        List<Order> orderList = new ArrayList<>();
        Order order = new Order();
        order.setId("1");
        order.setDescription("order_desc");
        orderList.add(order);

        Mockito.when(orderRepostiroty.findAll()).thenReturn(orderList);

        List<Order> returnedOrderList = orderService.getAllOrder();
        assertEquals(returnedOrderList.size(), orderList.size());


    }
}
