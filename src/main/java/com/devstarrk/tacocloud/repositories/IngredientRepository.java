package com.devstarrk.tacocloud.repositories;

import com.devstarrk.tacocloud.entities.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
