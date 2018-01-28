package com.rs.springframework.spring5recipeapp.services;

import com.rs.springframework.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by rs on 1/27/2018.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
