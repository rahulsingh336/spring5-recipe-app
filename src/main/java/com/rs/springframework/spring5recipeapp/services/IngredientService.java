package com.rs.springframework.spring5recipeapp.services;

import com.rs.springframework.spring5recipeapp.commands.IngredientCommand;

/**
 * Created by rs on 1/27/2018.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}