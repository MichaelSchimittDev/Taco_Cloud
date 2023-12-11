package com.devstarrk.tacoCloud.web.api;

import com.devstarrk.tacoCloud.Ingredient;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;


public class IngredientResourceAssembler extends ResourceAssemblerSupport<Ingredient, IngredientResource>{

    public IngredientResourceAssembler() {
        super(IngredientController.class, IngredientResource.class);
    }

    @Override
    public IngredientResource toResource(Ingredient ingredient) {
        return createResourceWithId(ingredient.getId(), ingredient);
    }

    @Override
    protected IngredientResource instantiateResource(
            Ingredient ingredient) {
        return new IngredientResource(ingredient);
    }

}
