package com.rs.springframework.spring5recipeapp.repositories;

import com.rs.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by rs on 1/23/2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    //Optional return type of spring 5
    Optional<UnitOfMeasure> findByDescription(String description);
}