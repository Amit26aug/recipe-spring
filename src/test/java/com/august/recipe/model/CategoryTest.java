package com.august.recipe.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @AfterEach
    void tearDown() {
        category = null;
    }

    @Test
    void getRecipes() {
        Set<Recipe> recipes = new HashSet<>(Collections.singletonList(new Recipe()));
        category.setRecipes(recipes);
        assertEquals(recipes, category.getRecipes());
    }

    @Test
    void setId() {
        Long id = 1L;
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    void setDescription() {
        String des = "Nothing";
        category.setDescription(des);
        assertEquals(des, category.getDescription());
    }
}