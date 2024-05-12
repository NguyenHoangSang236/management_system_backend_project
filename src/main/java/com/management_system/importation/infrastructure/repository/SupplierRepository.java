package com.management_system.importation.infrastructure.repository;

import com.management_system.importation.entities.database.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplierRepository extends MongoRepository<Category, String> {

}
