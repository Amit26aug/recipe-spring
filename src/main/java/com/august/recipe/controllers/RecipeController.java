package com.august.recipe.controllers;

import com.august.recipe.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller()
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("recipe")
    public String recipes(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());
        return "recipes/list";
    }
}
