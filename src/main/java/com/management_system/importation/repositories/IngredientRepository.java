package com.management_system.importation.repositories;

import com.management_system.importation.entities.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {

}
