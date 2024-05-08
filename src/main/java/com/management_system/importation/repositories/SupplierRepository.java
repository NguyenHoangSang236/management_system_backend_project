package com.management_system.importation.repositories;

import com.management_system.importation.entities.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplierRepository extends MongoRepository<Supplier, String> {

}
