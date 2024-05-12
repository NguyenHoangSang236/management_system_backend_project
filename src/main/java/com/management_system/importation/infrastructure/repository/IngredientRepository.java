package com.management_system.importation.infrastructure.repository;

import com.management_system.importation.entities.database.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends MongoRepository<Ingredient, String> {

}
