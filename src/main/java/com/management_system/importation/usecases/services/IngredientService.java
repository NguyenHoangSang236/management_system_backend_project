package com.management_system.importation.usecases.services;

import com.management_system.importation.entities.database.Ingredient;
import com.management_system.importation.infrastructure.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    @Autowired
    IngredientRepository ingredientRepo;

    public ResponseEntity addIngredient(Ingredient ingredient) {
        ingredientRepo.insert(ingredient);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    public ResponseEntity getAllIngredients() {
        List<Ingredient> allIngredients = ingredientRepo.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(allIngredients);
    }

    public ResponseEntity deleteIngredient(Ingredient ingredient) {
        ingredientRepo.delete(ingredient);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    public ResponseEntity updateIngredient(Ingredient ingredient) {
        ingredientRepo.save(ingredient);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
