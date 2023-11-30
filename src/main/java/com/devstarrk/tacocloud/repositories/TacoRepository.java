package com.devstarrk.tacocloud.repositories;

import com.devstarrk.tacocloud.entities.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
