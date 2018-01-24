package com.rs.springframework.spring5recipeapp.services;

import com.rs.springframework.spring5recipeapp.domain.Recipe;
import com.rs.springframework.spring5recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by rs on 1/23/2018.
 */

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.info("inside getRecipes, {}", "test");
        Set<Recipe> recipeSet1 = new HashSet<>();
        List<Recipe> recipeSet = (List<Recipe>) recipeRepository.findAll();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet1::add);
        return recipeSet1;
    }
}
