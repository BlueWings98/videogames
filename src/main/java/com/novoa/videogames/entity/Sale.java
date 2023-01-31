package com.novoa.videogames.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Sales")
public class Sale {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String saleId;
    @DynamoDBAttribute
    private String productName;
    @DynamoDBAttribute
    private String price;
    @DynamoDBAttribute
    private String discount;
}
