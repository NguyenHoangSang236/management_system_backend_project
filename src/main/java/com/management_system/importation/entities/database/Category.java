package com.management_system.importation.entities.database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("category")
public class Category implements Serializable {
    @Id
    String id;

    @Field(name = "name")
    @Indexed(unique = true)
    String name;

    @Field(name = "ingredient_id_list")
    List<String> ingredientIdList;

    @Field(name = "product_id_list")
    List<String> productIdList;
}
