package com.devstarrk.tacocloud.repositories;

import com.devstarrk.tacocloud.entities.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save(Ingredient ingredient);
}
