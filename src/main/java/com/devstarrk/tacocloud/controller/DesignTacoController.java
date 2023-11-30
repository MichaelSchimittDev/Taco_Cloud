package com.devstarrk.tacocloud.controller;

import com.devstarrk.tacocloud.entities.Ingredient;
import com.devstarrk.tacocloud.entities.Ingredient.Type;
import com.devstarrk.tacocloud.entities.Order;
import com.devstarrk.tacocloud.entities.Taco;
import com.devstarrk.tacocloud.repositories.IngredientRepository;
import com.devstarrk.tacocloud.repositories.TacoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {

    private final IngredientRepository ingredientRepository;

    private TacoRepository tacoRepository;

    @Autowired
    public DesignTacoController(IngredientRepository ingredientRepository, TacoRepository tacoRepository) {
        this.ingredientRepository = ingredientRepository;
        this.tacoRepository = tacoRepository;
    }

    @ModelAttribute(name = "order")
    public Order order(){
        return new Order();
    }

    @ModelAttribute(name = "design")
    public Taco design(){
        return new Taco();
    }

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientRepository.findAll().forEach(ingredients::add);

        Type[] types = Ingredient.Type.values();
        for (Type type : types){
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }

        return "design";
    }

    @PostMapping
    public String processDesign(@Valid Taco taco, Errors errors, @ModelAttribute Order order){
        if(errors.hasErrors()){
            return "design";
        }

        Taco saved = tacoRepository.save(taco);
        order.addDesign(saved);

        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
