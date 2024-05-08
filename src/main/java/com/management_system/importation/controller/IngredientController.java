package com.management_system.importation.controller;

import com.management_system.importation.entities.Ingredient;
import com.management_system.importation.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
