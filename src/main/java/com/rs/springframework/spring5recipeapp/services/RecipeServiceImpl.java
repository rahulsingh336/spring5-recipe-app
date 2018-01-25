package com.rs.springframework.spring5recipeapp.services;

import com.rs.springframework.spring5recipeapp.commands.RecipeCommand;
import com.rs.springframework.spring5recipeapp.converters.RecipeCommandToRecipe;
import com.rs.springframework.spring5recipeapp.converters.RecipeToRecipeCommand;
import com.rs.springframework.spring5recipeapp.domain.Recipe;
import com.rs.springframework.spring5recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by rs on 1/23/2018.
 */

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;
    private final RecipeToRecipeCommand recipeToRecipeCommand;
    private final RecipeCommandToRecipe recipeCommandToRecipe;

    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeToRecipeCommand recipeToRecipeCommand, RecipeCommandToRecipe recipeCommandToRecipe) {
        this.recipeRepository = recipeRepository;
        this.recipeToRecipeCommand = recipeToRecipeCommand;
        this.recipeCommandToRecipe = recipeCommandToRecipe;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.info("inside getRecipes, {}", "test");
        Set<Recipe> recipeSet1 = new HashSet<>();
        //List<Recipe> recipeSet = (List<Recipe>) recipeRepository.findAll();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet1::add);
        return recipeSet1;
    }

    @Override
    public Recipe findById(Long l) {

        Optional<Recipe> recipeOptional = recipeRepository.findById(l);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe Not Found!");
        }

        return recipeOptional.get();
    }

    @Override
    @Transactional
    public RecipeCommand saveRecipeCommand(RecipeCommand command) {
        Recipe detachedRecipe = recipeCommandToRecipe.convert(command);

        Recipe savedRecipe = recipeRepository.save(detachedRecipe);
        log.info("Saved RecipeId:" + savedRecipe.getId());
        return recipeToRecipeCommand.convert(savedRecipe);
    }

    @Override
    @Transactional
    public RecipeCommand findCommandById(Long l) {
        return recipeToRecipeCommand.convert(findById(l));
    }

    @Override
    public void deleteById(Long idToDelete) {
        recipeRepository.deleteById(idToDelete);
        log.info("Deleted RecipeId: {}", idToDelete);
    }
}
