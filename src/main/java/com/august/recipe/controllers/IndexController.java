package com.august.recipe.controllers;

import com.august.recipe.repositories.CategoryRepository;
import com.august.recipe.repositories.UnitOfMeasureRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "index"})
    public String index() {
        log.info("The category with description American has an id: "
                + categoryRepository.findByDescription("American").get().getId());
        log.info("The unit of measurement with unit description Tablespoon has an id: "
                + unitOfMeasureRepository.findByUnitDescription("Tablespoon").get().getId());
        return "index";
    }

}
