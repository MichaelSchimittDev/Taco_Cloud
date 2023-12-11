package com.devstarrk.tacoCloud.data;


import com.devstarrk.tacoCloud.Order;
import com.devstarrk.tacoCloud.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long>{

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

}
