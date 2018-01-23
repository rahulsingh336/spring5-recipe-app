package com.rs.springframework.spring5recipeapp.repositories;

import com.rs.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by rs on 1/23/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    //Optional return type of spring 5
    Optional<Category> findByDescription(String description);
}
