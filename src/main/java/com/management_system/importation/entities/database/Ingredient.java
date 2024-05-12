package com.management_system.importation.entities.database;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("ingredient")
public class Ingredient implements Serializable {
    @Id
    String id;

    @Field(name = "name")
    String name;

    @Field(name = "image")
    String image;

    @Field(name = "status")
    String status;

    @Field(name = "last_update_date")
    Date lastUpdateDate;

    @Field(name = "note")
    String note;
}
