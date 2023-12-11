package com.devstarrk.tacoCloud.data;

import com.devstarrk.tacoCloud.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    User findByUsername(String username);

}
