package com.devstarrk.tacoCloud.web.api;

import com.devstarrk.tacoCloud.Ingredient;
import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;

public class IngredientResource  extends ResourceSupport{

    @Getter
    private String name;

    @Getter
    private Ingredient.Type type;

    public IngredientResource(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}
