package br.com.nexfar.applicationtest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Product {

    @Field(name = "id")

    private ObjectId id;

    @Field(name = "sku")
    private String sku;

    @Field(name = "barcode")
    private String barcode;

    @Field(name = "name")
    private String name;

    @Field(name = "maker")
    private String maker;

    @Field(name = "category")
    private String category;

    @Field(name = "principle")
    private String principle;

    @Field(name = "boxQuantity")
    private Decimal128 boxQuantity;

    @Field(name = "imageURL")
    private ObjectId imageURL;

    @Field(name = "paymentStatus")
    private Decimal128 paymentStatus;

}
