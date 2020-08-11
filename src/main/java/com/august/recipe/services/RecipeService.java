package com.august.recipe.services;

import com.august.recipe.model.Recipe;
import com.august.recipe.repositories.RecipeRepository;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
