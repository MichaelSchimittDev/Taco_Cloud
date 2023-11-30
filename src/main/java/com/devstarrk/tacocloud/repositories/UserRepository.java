package com.devstarrk.tacocloud.repositories;

import com.devstarrk.tacocloud.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);


}
