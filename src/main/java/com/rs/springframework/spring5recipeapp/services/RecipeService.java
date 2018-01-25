package com.rs.springframework.spring5recipeapp.services;

import com.rs.springframework.spring5recipeapp.commands.RecipeCommand;
import com.rs.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;
/**
 * Created by rs on 1/23/2018.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}