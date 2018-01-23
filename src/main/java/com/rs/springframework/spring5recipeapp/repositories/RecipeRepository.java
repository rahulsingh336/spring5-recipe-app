package com.rs.springframework.spring5recipeapp.repositories;

import com.rs.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by rs on 1/23/2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}