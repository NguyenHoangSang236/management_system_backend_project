package com.management_system.importation.entities.database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("importation_history")
public class ImportationHistory {
    @Id
    String lot_code;

    @Field(name = "image")
    String image;

    @Field(name = "quantity")
    double quantity;

    @Field(name = "import_date")
    Date importDate;

    @Field(name = "manufacture_date")
    Date manufactureDate;

    @Field(name = "expiration_date")
    Date expirationDate;

    @Field(name = "measurement_unit")
    String measurementUnit;

    @Field(name = "ingredient_id")
    String ingredientId;

    @Field(name = "facility_id")
    String facilityId;

    @Field(name = "status")
    ImportationStatus status;

    @Field(name = "supplier")
    Supplier supplier;
}
