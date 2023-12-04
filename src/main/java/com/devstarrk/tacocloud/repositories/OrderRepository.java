package com.devstarrk.tacocloud.repositories;

import com.devstarrk.tacocloud.entities.Order;
import com.devstarrk.tacocloud.entities.User;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

}
