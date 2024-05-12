package com.management_system.importation.infrastructure.controller;

import com.management_system.importation.usecases.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    @Autowired
    IngredientService ingredientService;

    @GetMapping("/allIngredients")
    public ResponseEntity getAllIngredients() {
        return ingredientService.getAllIngredients();
    }
}
