package com.management_system.importation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("suppliers")
public class Supplier {
    @Id
    String id;

    @Field(name = "name")
    @Indexed(unique = true)
    String name;

    @Field(name = "location")
    String location;
}
