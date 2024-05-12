package com.management_system.importation.entities.database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("importation_status")
public class ImportationStatus {
    @Field(name = "name")
    String name;

    @Field(name = "debt_amount")
    double debtAmount;

    @Field(name = "debt_money")
    double debtMoney;

    @Field(name = "failed_amount")
    double failedAmount;

    @Field(name = "success_amount")
    double successAmount;

    @Field(name = "paid_money")
    double paidMoney;

    @Field(name = "note")
    String note;
}
