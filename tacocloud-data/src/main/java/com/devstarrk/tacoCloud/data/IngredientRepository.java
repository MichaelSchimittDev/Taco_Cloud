package com.devstarrk.tacoCloud.data;

import com.devstarrk.tacoCloud.Ingredient;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
public interface IngredientRepository extends CrudRepository<Ingredient, String>{
}
