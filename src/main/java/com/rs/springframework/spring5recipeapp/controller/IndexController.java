package com.rs.springframework.spring5recipeapp.controller;

import com.rs.springframework.spring5recipeapp.domain.Category;
import com.rs.springframework.spring5recipeapp.domain.UnitOfMeasure;
import com.rs.springframework.spring5recipeapp.repositories.CategoryRepository;
import com.rs.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import com.rs.springframework.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

/**
 * Created by rs on 1/23/2018.
 */
@Slf4j
@Controller
public class IndexController {

   /* private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }*/

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","","/index"})
    public String getIndex(Model model){
       /* Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is : " + categoryOptional.get().getId());
        System.out.println("UOM ID is : " + unitOfMeasureOptional.get().getId());*/
        log.debug("Getting Index page");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
