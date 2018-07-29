package in.niraj.spring.springbootjpah2.repository;

import in.niraj.spring.springbootjpah2.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * created by niraj on Jul, 2018
 */
@Repository
public interface OrderRepostiroty extends CrudRepository<Order, String> {

}
