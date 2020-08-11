package com.august.recipe.services;

import com.august.recipe.model.Recipe;
import com.august.recipe.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Set;

class RecipeServiceImplTest {

  RecipeService recipeService;

  @Mock
  RecipeRepository recipeRepository;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.initMocks(this);
    recipeService = new RecipeServiceImpl(recipeRepository);
  }

  @Test
  void getRecipes() {
    Recipe recipe = new Recipe();
    HashSet recipeData = new HashSet();
    recipeData.add(recipe);

    when(recipeRepository.findAll()).thenReturn(recipeData);
    Set recipes = recipeService.getRecipes();
    recipes = recipeService.getRecipes();

    assertEquals(recipeData.size(), 1);
    verify(recipeRepository, times(2)).findAll();
  }
}