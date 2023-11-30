package com.devstarrk.tacocloud.repositories;

import com.devstarrk.tacocloud.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
