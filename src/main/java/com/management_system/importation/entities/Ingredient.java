package com.management_system.importation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("ingredients")
public class Ingredient {
    @Id
    String id;

    @Field(name = "name")
    String name;

    @Field(name = "quantity")
    double quantity;

    @Field(name = "import_date")
    String importDate;

    @Field(name = "supplier")
    Supplier supplier;



}
