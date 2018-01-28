package com.rs.springframework.spring5recipeapp.repositories;

import com.rs.springframework.spring5recipeapp.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rs on 1/28/2018.
 */
@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
